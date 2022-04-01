package ru.gb.CRMpsy.factory.sending_letters;

import ru.gb.CRMpsy.dtos.Letter;
import ru.gb.CRMpsy.factory.sending_letters.SendingLetters;

public class EmailSender implements SendingLetters {

    @Override
    public void sendLetter(Letter letter) {
        System.out.println("Sending letter : " + letter.getMessage() + " on email: " + letter.getAddress());
    }
}
