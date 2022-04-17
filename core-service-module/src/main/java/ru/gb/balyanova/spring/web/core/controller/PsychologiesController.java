package ru.gb.balyanova.spring.web.core.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.balyanova.spring.web.core.converter.PsyConverter;
import ru.gb.balyanova.spring.web.core.dtos.PsychologiesDto;
import ru.gb.balyanova.spring.web.core.service.PsychologiesService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/psychologies")
@RequiredArgsConstructor
public class PsychologiesController {
    private final PsychologiesService psychologiesService;
    private final PsyConverter psyConverter;

    @GetMapping
    public List<PsychologiesDto> findAll() {
        return psychologiesService.findAll();
    }

//    @GetMapping
//    public Page<PsychologiesDto> findAll(
//            @RequestParam(name = "p", defaultValue = "1") Integer page,
//            @RequestParam(name = "problem_part", required = false) String problemPart,
//            @RequestParam(name = "method_part", required = false) String methodPart,
//            @RequestParam(name = "birthday_part", required = false) Integer birthdayPart
//    ) {
//        if (page < 1) {
//            page = 1;
//        }
//        return psychologiesService.findAll(page, problemPart, methodPart, birthdayPart).map(
//                p -> psyConverter.entityToDto(p)
//        );
//    }
}
