package ru.gb.CRMpsy.service;

import org.springframework.stereotype.Service;
import ru.gb.CRMpsy.dtos.Letter;
import ru.gb.CRMpsy.factory.BonusLetterFactory;
import ru.gb.CRMpsy.factory.LetterFactory;

@Service
public class LetterService {
    //реализован паттерн абстрактной фабрики и фабричного метода по отправке письма с бонусом клиенту
    //соответственно появились LetterFactory (interface), LetterService, BonusLetterFactory, LetterController и dto Letter

    public Letter create (String address, int type) {
        return createFactory(type).create(address);
    }

    private LetterFactory createFactory (int type) {
        if (type == 1) {
            return new BonusLetterFactory();
            //todo create few letters
        }
        throw new IllegalArgumentException("Wrong type");
    }
}
