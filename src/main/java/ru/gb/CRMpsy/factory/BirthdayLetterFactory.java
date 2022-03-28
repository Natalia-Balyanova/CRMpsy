package ru.gb.CRMpsy.factory;

import ru.gb.CRMpsy.dtos.Letter;

public class BirthdayLetterFactory implements LetterFactory{

    @Override
    public Letter create(String address, String phone) {
        return new Letter(address, "Happy Birthday!", phone);
    }
}
