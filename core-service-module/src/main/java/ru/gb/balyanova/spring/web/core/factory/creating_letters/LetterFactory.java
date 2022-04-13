package ru.gb.balyanova.spring.web.core.factory.creating_letters;

import ru.gb.balyanova.spring.web.core.dtos.Letter;

public interface LetterFactory {
    Letter create (String address, String phone);
}
