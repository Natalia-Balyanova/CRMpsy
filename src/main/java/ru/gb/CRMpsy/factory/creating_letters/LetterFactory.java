package ru.gb.CRMpsy.factory.creating_letters;

import ru.gb.CRMpsy.dtos.Letter;

public interface LetterFactory {
    Letter create (String address, String phone);
}
