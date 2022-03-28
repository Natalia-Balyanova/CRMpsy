package ru.gb.CRMpsy.factory;

import ru.gb.CRMpsy.dtos.Letter;

public interface LetterFactory {
    Letter create (String address, String phone);
}
