package ru.gb.CRMpsy.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.gb.CRMpsy.entities.Problem;
import ru.gb.CRMpsy.entities.Psychologies;

import java.util.List;
import java.util.Optional;

@Repository
public interface PsychologiesRepository extends JpaRepository<Psychologies, Long>, JpaSpecificationExecutor<Psychologies> {

//    Optional<Psychologies> findByBirthday(int birthday);
//
//    Optional<Psychologies> findByProblem(Problems problems);
}
