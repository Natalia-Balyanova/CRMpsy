package ru.gb.balyanova.spring.web.core.factory.sending_letters;

import ru.gb.balyanova.spring.web.core.dtos.Letter;

public interface SendingLetters {
    void sendLetter(Letter letter);
}
