package ru.gb.CRMpsy.factory;

import ru.gb.CRMpsy.dtos.Letter;

public class EmailSender implements SendingLetters{

    @Override
    public void sendLetter(Letter letter) {
        System.out.println("Sending letter : " + letter.getMessage() + " on email: " + letter.getAddress());
    }
}
