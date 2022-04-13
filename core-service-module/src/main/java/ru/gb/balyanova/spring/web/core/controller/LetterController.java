package ru.gb.balyanova.spring.web.core.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.balyanova.spring.web.core.dtos.Letter;
import ru.gb.balyanova.spring.web.core.service.LetterService;

@RestController
@RequestMapping("/api/v1/letters")
@RequiredArgsConstructor
public class LetterController {
    private final LetterService letterService;

    @GetMapping("/{address}/{phone}/{type}")
    public Letter createLetter(@PathVariable String address, @PathVariable String phone, @PathVariable LetterService.LetterType type) {
        return letterService.create(address, phone, type);
}

    @PostMapping("/send")
    public void sendLetter(@RequestBody Letter letter) {
        letterService.sendLetter(letter);
    }

}
