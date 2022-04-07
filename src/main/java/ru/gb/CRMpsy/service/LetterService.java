package ru.gb.CRMpsy.service;

import org.springframework.stereotype.Service;
import ru.gb.CRMpsy.dtos.Letter;
import ru.gb.CRMpsy.factory.creating_letters.BirthdayLetterFactory;
import ru.gb.CRMpsy.factory.creating_letters.BonusLetterFactory;
import ru.gb.CRMpsy.factory.creating_letters.LetterFactory;
import ru.gb.CRMpsy.factory.sending_letters.EmailSender;
import ru.gb.CRMpsy.factory.sending_letters.MessengerSender;
import ru.gb.CRMpsy.factory.sending_letters.SendingLetters;

@Service
public class LetterService {
    //Lesson 3 реализован паттерн абстрактной фабрики и фабричного метода по отправке письма с бонусом клиенту
    //соответственно появились LetterFactory (interface), LetterService, BonusLetterFactory, LetterController и dto Letter

    //Lesson 4 реализован структурный паттерн декоратор. Изначально можно отправлять письма на почту, но функционал разширился до мессенджера
    //(предполагается, что можно добавлять разные мессенджеры)
    public Letter create (String address, String phone, LetterType type) {
        return createFactory(type).create(address, phone);
    }

    private LetterFactory createFactory (LetterType type) {
        switch (type) {
            case BIRTH:
                return new BirthdayLetterFactory();
            case BONUS:
                return new BonusLetterFactory();
            default:
                throw new IllegalArgumentException("Wrong type");
        }
    }

    public enum LetterType{
        BIRTH, BONUS
    }

    public void sendLetter(Letter letter) {
        SendingLetters sendingLetters = new EmailSender();
        sendingLetters = new MessengerSender(sendingLetters);
        sendingLetters.sendLetter(letter);
    }
}
