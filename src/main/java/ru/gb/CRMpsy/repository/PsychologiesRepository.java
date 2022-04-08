package ru.gb.CRMpsy.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import ru.gb.CRMpsy.entities.Psychologies;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface PsychologiesRepository {

//    Optional<Psychologies> findByBirthday(int birthday);
//
//    Optional<Psychologies> findByProblem(String problem);
//
//    Map<Object, Object> findById(Long psychologiesId);
//
//    Page<Psychologies> findAll(Specification<Psychologies> spec, PageRequest of);
}
//hibernate
//@Repository
//@EnableJpaRepositories
//public interface PsychologiesRepository extends JpaRepository<Psychologies, Long>, JpaSpecificationExecutor<Psychologies> {
//
//    Optional<Psychologies> findByBirthday(int birthday);
//
//    Optional<Psychologies> findByProblem(Problem problem);
//}
