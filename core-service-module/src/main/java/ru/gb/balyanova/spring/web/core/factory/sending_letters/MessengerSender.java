package ru.gb.balyanova.spring.web.core.factory.sending_letters;

import ru.gb.balyanova.spring.web.core.dtos.Letter;

public class MessengerSender extends AbstractSending {
    public MessengerSender(SendingLetters sendingLetters) {
        super(sendingLetters);
    }

    @Override
    public void sendLetter(Letter letter) {
        super.sendLetter(letter);
        System.out.println("Sending message : " + letter.getMessage() + " on phone: " + letter.getPhone());
    }
}
