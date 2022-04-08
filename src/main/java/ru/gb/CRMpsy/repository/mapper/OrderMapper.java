package ru.gb.CRMpsy.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.gb.CRMpsy.entities.Order;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<Order> {
    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
        Order order = new Order();
        order.setId(rs.getLong("id"));
        order.setClientId(rs.getLong("client_id"));
        order.setPrice(rs.getInt("price"));
        return order;
    }
}
