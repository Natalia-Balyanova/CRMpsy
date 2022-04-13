package ru.gb.balyanova.spring.web.core.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.gb.balyanova.spring.web.core.entities.Order;


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
