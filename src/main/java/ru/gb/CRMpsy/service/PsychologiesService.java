package ru.gb.CRMpsy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.gb.CRMpsy.entities.Psychologies;
import ru.gb.CRMpsy.repository.PsychologiesRepository;
import ru.gb.CRMpsy.repository.specifications.PsychologiesSpecifications;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PsychologiesService {
    public final PsychologiesRepository psychologiesRepository;

    public Page<Psychologies> findAll(Integer page, String problemPart, String methodPart, Integer birthdayPart) {
        Specification<Psychologies> spec = Specification.where(null);
        if (problemPart != null) {
            spec = spec.and(PsychologiesSpecifications.problemEqual(problemPart));
        }
        if (methodPart != null) {
            spec = spec.and(PsychologiesSpecifications.methodLike(methodPart));
        }
        if (birthdayPart != null){
            spec = spec.and(PsychologiesSpecifications.birthdayGreaterOrEqualsThan(birthdayPart));
        }
        return psychologiesRepository.findAll(spec, PageRequest.of(page - 1, 8));
    }

//    public Optional<Psychologies> findByBirthday(int birthday) {
//        return psychologiesRepository.findByBirthday(birthday);
//    }
//
//    public Optional<Psychologies> findByProblem(Problems problems) {
//        return psychologiesRepository.findByProblem(problems);
//    }
}
