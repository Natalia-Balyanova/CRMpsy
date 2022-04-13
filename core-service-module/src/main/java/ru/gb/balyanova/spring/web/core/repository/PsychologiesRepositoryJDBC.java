package ru.gb.balyanova.spring.web.core.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.gb.balyanova.spring.web.core.entities.Psychologies;
import ru.gb.balyanova.spring.web.core.repository.mapper.PsychologiesMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class PsychologiesRepositoryJDBC {
    private final JdbcTemplate jdbcTemplate;
    private final Map<Long, Psychologies> psychologiesIdentityMap = new HashMap<>();

    public List<Psychologies> findAll(){
        return jdbcTemplate.query("SELECT * FROM psychologies",
                new Object[]{}, new PsychologiesMapper());
    }

    public Psychologies findById(Long id) {
        Psychologies psychologies = psychologiesIdentityMap.get(id);
        if (psychologies == null) {
            psychologies = jdbcTemplate.queryForObject("SELECT * FROM psychologies WHERE id=?", new Object[]{id},
                    new PsychologiesMapper());
            if (psychologies != null) {
                psychologiesIdentityMap.put(id, psychologies);
            }
        }
        return psychologies;
    }

    public Psychologies findByBirthday(int birthday) {
        Psychologies psychologies = psychologiesIdentityMap.get(birthday);
        psychologies = jdbcTemplate.queryForObject("SELECT * FROM psychologies WHERE birthday=?", new Object[]{birthday},
        new PsychologiesMapper());
        if (psychologies != null) {
            psychologiesIdentityMap.put((long) birthday, psychologies);
        }
        return psychologies;
    }

//    public Psychologies findByProblem(String problem) {
//        Psychologies psychologies = psychologiesIdentityMap.get(problem);
//        psychologies = jdbcTemplate.queryForObject("SELECT * FROM psychologies WHERE problem=?", new Object[]{problem},
//                new PsychologiesMapper());
//        if (psychologies != null) {
//            psychologiesIdentityMap.put(problem, psychologies);
//        }
//        return psychologies;
//    }

}
