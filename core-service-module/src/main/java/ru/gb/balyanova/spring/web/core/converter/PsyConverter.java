package ru.gb.balyanova.spring.web.core.converter;

import org.springframework.stereotype.Component;
import ru.gb.balyanova.spring.web.core.dtos.PsychologiesDto;
import ru.gb.balyanova.spring.web.core.entities.Psychologies;

@Component
public class PsyConverter {
    public Psychologies dtoToEntity(PsychologiesDto psychologiesDto) {
        return new Psychologies(psychologiesDto.getId(), psychologiesDto.getProblemsTitle(), psychologiesDto.getMethod(), psychologiesDto.getBirthday());
    }

    public PsychologiesDto entityToDto(Psychologies psychologies) {
        return new PsychologiesDto(psychologies.getId(), psychologies.getProblemTitle(), psychologies.getMethod(), psychologies.getBirthday());
    }
}
