package ru.gb.CRMpsy.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.gb.CRMpsy.entities.Order;
import ru.gb.CRMpsy.entities.OrderItem;

import java.util.List;


@Data
@NoArgsConstructor
public class OrderDto {

    private Long id;
    private Long clientId;
    //private List<OrderItem> orderItems;
    private int price;

    public OrderDto(Order order) {
        this.id = order.getId();
        //this.clientId = order.getClient().getId();
        this.clientId = order.getClientId();
        //this.orderItems = order.getOrderItems();
        this.price = order.getPrice();
    }
}
