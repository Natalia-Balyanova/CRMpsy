package ru.gb.CRMpsy.factory.creating_letters;

import ru.gb.CRMpsy.dtos.Letter;

public class BonusLetterFactory implements LetterFactory {
    @Override
    public Letter create(String address, String phone) {
        return new Letter(address, "You have bonus 15% coupon for next consultation", phone);
    }
}
