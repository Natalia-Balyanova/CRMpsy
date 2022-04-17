package ru.gb.balyanova.spring.web.core.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.balyanova.spring.web.core.dtos.ClientDto;
import ru.gb.balyanova.spring.web.core.service.ClientService;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/birthday")
    public List<ClientDto> findAllByBirthday() throws SQLException {
        LocalDate date = LocalDate.now();
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        return clientService.findAllByBirthday(day, month);
    }

    @GetMapping("/{psychologiesId}")
    public List<ClientDto> findAllByPsychologiesId(@PathVariable Long psychologiesId) throws SQLException {
        return clientService.findAllByPsychologiesId(psychologiesId);
    }

    @PostMapping("/report/{name}/{reportType}/{psychologiesId}")
    public void makeReport2(@PathVariable String name, @PathVariable ClientService.ReportType reportType, @PathVariable (required = false)  Long psychologiesId, @RequestBody List<ClientDto> clients){
        if (name != null && psychologiesId != null){
            clientService.makeReport(name, clients, reportType, psychologiesId);
        } else {
            clientService.makeReport(name, clients, reportType);
        }
    }
}
