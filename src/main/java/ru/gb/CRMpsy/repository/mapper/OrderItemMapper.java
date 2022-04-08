package ru.gb.CRMpsy.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import ru.gb.CRMpsy.entities.OrderItem;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderItemMapper implements RowMapper<OrderItem> {
    @Override
    public OrderItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        OrderItem orderItem = new OrderItem();
        orderItem.setId(rs.getLong("id"));
        orderItem.setOrderId(rs.getLong("order_id"));
        orderItem.setPsychologiesId(rs.getLong("psychologies_id"));
        orderItem.setPrice(rs.getInt("price"));
        return orderItem;
    }
}
