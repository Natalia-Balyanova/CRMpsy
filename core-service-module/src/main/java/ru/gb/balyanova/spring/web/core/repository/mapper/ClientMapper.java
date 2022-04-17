package ru.gb.balyanova.spring.web.core.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.gb.balyanova.spring.web.core.entities.Client;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ClientMapper implements RowMapper<Client> {
    //Lesson6
    //Сделаны мапперы (ClientMapper, Order,OrderItem, Psychologies), допавлены репозитории
    //Связь с БД через JdbcTemplate.
    //Реализована identityMap в тех случаях, когда поиск в БД на основе id

    @Override
    public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
        //PreparedStatement statement = connection.prepareStatement("SELECT id, name, birth_day, birth_month, birth_year, email, phone FROM CLIENTS WHERE id=?");
        Client client = new Client();
        client.setId(rs.getLong("id"));
        client.setName(rs.getString("name"));
        client.setBirthDay(rs.getInt("birth_day"));
        client.setBirthMonth(rs.getInt("birth_month"));
        client.setBirthYear(rs.getInt("birth_year"));
        client.setEmail(rs.getString("email"));
        client.setPhone(rs.getString("phone"));
        return client;
    }
}
