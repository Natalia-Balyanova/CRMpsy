package ru.gb.CRMpsy.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.gb.CRMpsy.entities.Order;
import ru.gb.CRMpsy.repository.mapper.OrderMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryJDBC {
    private final JdbcTemplate jdbcTemplate;
    private final Map<Long, Order> orderIdentityMap = new HashMap<>();

    public List<Order> findAll() {//price?
        return jdbcTemplate.query(
                "SELECT * FROM orders",
                new Object[]{}, new OrderMapper());
    }

    public Order findById (Long id){
        Order order = orderIdentityMap.get(id);
        if(order == null){
            order = jdbcTemplate.queryForObject(
                    "SELECT * FROM orders WHERE id=?",
                    new Object[]{id}, new OrderMapper());
            if (order != null){
                orderIdentityMap.put(id, order);
            }
        }
        return order;
    }
}
