package ru.gb.CRMpsy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.CRMpsy.converter.PsyConverter;
import ru.gb.CRMpsy.dtos.PsychologiesDto;
import ru.gb.CRMpsy.service.PsychologiesService;

@RestController
@RequestMapping("/api/v1/psychologies")
@RequiredArgsConstructor
public class PsychologiesController {
    private final PsychologiesService psychologiesService;
    private final PsyConverter psyConverter;

    @GetMapping
    public Page<PsychologiesDto> getAllPsychologies(
            @RequestParam(name = "p", defaultValue = "1") Integer page,
            @RequestParam(name = "problem_part", required = false) String problemPart,
            @RequestParam(name = "method_part", required = false) String methodPart,
            @RequestParam(name = "birthday_part", required = false) Integer birthdayPart
    ) {
        if (page < 1) {
            page = 1;
        }
        return psychologiesService.findAll(page, problemPart, methodPart, birthdayPart).map(
                p -> psyConverter.entityToDto(p)
        );
    }
}
