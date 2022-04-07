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

    @GetMapping("/birthday")
    public List<ClientDto> findAllByBirthday() {
        LocalDate date = LocalDate.now();
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        return clientService.findAllByBirthday(day, month);
    }

    @GetMapping("/{psychologiesId}")
    public List<ClientDto> findAllByPsychologiesId(@PathVariable Long psychologiesId) {
        return clientService.findAllByPsychologiesId(psychologiesId);
    }

    @PostMapping("/report/{name}/{reportType}/{psychologiesId}")
    public void makeReport(@PathVariable String name, @PathVariable ClientService.ReportType reportType, @PathVariable (required = false)  Long psychologiesId, @RequestBody List<ClientDto> clients){
        if (psychologiesId != null){
            clientService.makeReport(name, clients, reportType, psychologiesId);
        } else {
            clientService.makeReport(name, clients, reportType);
        }
    }
}
