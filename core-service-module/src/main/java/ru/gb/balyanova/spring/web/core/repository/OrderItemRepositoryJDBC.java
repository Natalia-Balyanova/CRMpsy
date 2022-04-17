package ru.gb.balyanova.spring.web.core.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.gb.balyanova.spring.web.core.entities.OrderItem;
import ru.gb.balyanova.spring.web.core.repository.mapper.OrderItemMapper;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderItemRepositoryJDBC {
    private final JdbcTemplate jdbcTemplate;

    public List<OrderItem> findAllByPsychologiesId(Long psychologiesId){
        return jdbcTemplate.query(
                "SELECT * FROM order_items WHERE psychologies_id=?",
                new Object[]{psychologiesId}, new OrderItemMapper());
    }

}
