package ru.gb.CRMpsy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.CRMpsy.dtos.Letter;
import ru.gb.CRMpsy.service.LetterService;

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
