package ru.gb.balyanova.spring.web.core.factory.sending_letters;

import lombok.RequiredArgsConstructor;
import ru.gb.balyanova.spring.web.core.dtos.Letter;

@RequiredArgsConstructor
public class AbstractSending implements SendingLetters {
    private final SendingLetters sendingLetters;

    @Override
    public void sendLetter(Letter letter) {
        sendingLetters.sendLetter(letter);
    }
}