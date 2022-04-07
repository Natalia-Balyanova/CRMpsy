package ru.gb.CRMpsy.factory.sending_letters;

import ru.gb.CRMpsy.dtos.Letter;

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
