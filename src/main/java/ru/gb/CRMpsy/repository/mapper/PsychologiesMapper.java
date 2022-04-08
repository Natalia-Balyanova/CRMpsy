package ru.gb.CRMpsy.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.gb.CRMpsy.entities.Psychologies;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PsychologiesMapper implements RowMapper<Psychologies> {
    @Override
    public Psychologies mapRow(ResultSet rs, int rowNum) throws SQLException {
        Psychologies psychologies = new Psychologies();
        psychologies.setId(rs.getLong("id"));
        psychologies.setName(rs.getString("name"));
        psychologies.setSurname(rs.getString("surname"));
        psychologies.setBirthday(rs.getInt("birthday"));
        psychologies.setEmail(rs.getString("email"));
        psychologies.setMethod(rs.getString("method"));
        psychologies.setPrice(rs.getInt("price"));
        psychologies.setProblemTitle(rs.getString("problem_title"));
        return psychologies;
    }
}
