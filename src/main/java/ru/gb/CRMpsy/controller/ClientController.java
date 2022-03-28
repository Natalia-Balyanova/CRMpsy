package ru.gb.CRMpsy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.CRMpsy.dtos.ClientDto;
import ru.gb.CRMpsy.entities.Client;
import ru.gb.CRMpsy.service.ClientService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

//    @GetMapping("/birthday")
//    public List<ClientDto> findAlByBirthday(@PathVariable String birthday) {
//        return clientService.findAllByBirthday(birthday);
//    }

    @GetMapping("/{psychologiesId}")
    public List<ClientDto> findAlByPsychologiesId(@PathVariable Long psychologiesId) {
        return clientService.findAllByPsychologiesId(psychologiesId);
    }
}
