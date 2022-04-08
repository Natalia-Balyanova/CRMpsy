package ru.gb.CRMpsy.converter;

import org.springframework.stereotype.Component;
import ru.gb.CRMpsy.dtos.PsychologiesDto;
import ru.gb.CRMpsy.entities.Psychologies;

@Component
public class PsyConverter {
    public Psychologies dtoToEntity(PsychologiesDto psychologiesDto) {
        return new Psychologies(psychologiesDto.getId(), psychologiesDto.getProblemsTitle(), psychologiesDto.getMethod(), psychologiesDto.getBirthday());
    }

    public PsychologiesDto entityToDto(Psychologies psychologies) {
        return new PsychologiesDto(psychologies.getId(), psychologies.getProblemTitle(), psychologies.getMethod(), psychologies.getBirthday());
    }
}
