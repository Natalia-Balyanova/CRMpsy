package ru.gb.balyanova.spring.web.core.factory.creating_letters;

import ru.gb.balyanova.spring.web.core.dtos.Letter;

public class BirthdayLetterFactory implements LetterFactory {

    @Override
    public Letter create(String address, String phone) {
        return new Letter(address, "Happy Birthday!", phone);
    }
}
