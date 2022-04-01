package ru.gb.CRMpsy.factory.sending_letters;

import lombok.RequiredArgsConstructor;
import ru.gb.CRMpsy.dtos.Letter;
import ru.gb.CRMpsy.factory.sending_letters.SendingLetters;

@RequiredArgsConstructor
public class AbstractSending implements SendingLetters {
    private final SendingLetters sendingLetters;

    @Override
    public void sendLetter(Letter letter) {
        sendingLetters.sendLetter(letter);
    }
}