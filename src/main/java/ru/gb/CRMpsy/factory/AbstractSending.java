package ru.gb.CRMpsy.factory;

import lombok.RequiredArgsConstructor;
import ru.gb.CRMpsy.dtos.Letter;

@RequiredArgsConstructor
public class AbstractSending implements SendingLetters{
    private final SendingLetters sendingLetters;

    @Override
    public void sendLetter(Letter letter) {
        sendingLetters.sendLetter(letter);
    }
}