package ru.gb.CRMpsy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.CRMpsy.dtos.PsychologiesDto;
import ru.gb.CRMpsy.entities.Psychologies;
import ru.gb.CRMpsy.repository.PsychologiesRepositoryJDBC;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PsychologiesService {
    //public final PsychologiesRepository psychologiesRepository;
    public final PsychologiesRepositoryJDBC psychologiesRepositoryJDBC;

    public List<PsychologiesDto> findAll() {
        return psychologiesRepositoryJDBC.findAll().
                stream().map(PsychologiesDto::new).collect(Collectors.toList());
    }

    public Psychologies findById(Long psychologiesId) {
        return psychologiesRepositoryJDBC.findById(psychologiesId);
    }

    public Psychologies findByBirthday(int birthday) {
        return psychologiesRepositoryJDBC.findByBirthday(birthday);
    }

//    public Psychologies findByProblem(String problem) {
//        return psychologiesRepositoryJDBC.findByProblem(problem);
//    }
}
