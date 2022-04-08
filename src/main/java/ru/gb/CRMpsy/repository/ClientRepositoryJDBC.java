package ru.gb.CRMpsy.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.gb.CRMpsy.entities.Client;
import ru.gb.CRMpsy.repository.mapper.ClientMapper;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class ClientRepositoryJDBC {
    private final JdbcTemplate jdbcTemplate;
    private final Map<Long, Client> clientIdentityMap = new HashMap<>();

    public List<Client> findAllByBirthDayAndBirthMonth(int birthDay, int month) throws SQLException {
        return jdbcTemplate.query(
                "SELECT * FROM clients WHERE birth_day=?1 AND birth_month=?2",
                new Object[]{birthDay, month}, new ClientMapper());
    }

    public Client findById (Long id) throws SQLException{
        Client client = clientIdentityMap.get(id);
        if(client == null){
            client = jdbcTemplate.queryForObject(
                    "SELECT * FROM clients WHERE id=?",
                    new Object[]{id}, new ClientMapper());
            if(client != null){
                clientIdentityMap.put(id, client);
            }
        }
        return client;
    }
}
