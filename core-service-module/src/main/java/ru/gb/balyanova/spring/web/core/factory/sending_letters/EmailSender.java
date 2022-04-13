package ru.gb.balyanova.spring.web.core.factory.sending_letters;

import ru.gb.balyanova.spring.web.core.dtos.Letter;

public class EmailSender implements SendingLetters {

    @Override
    public void sendLetter(Letter letter) {
        System.out.println("Sending letter : " + letter.getMessage() + " on email: " + letter.getAddress());
    }
}
