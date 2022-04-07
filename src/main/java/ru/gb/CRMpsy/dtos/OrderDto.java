package ru.gb.CRMpsy.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.gb.CRMpsy.entities.Order;


@Data
@NoArgsConstructor
public class OrderDto {

    private Long id;
    private Long customerId;
    //private List<OrderItem> orderItems;
    private int totalPrice;

    public OrderDto(Order order) {
        this.id = order.getId();
        this.customerId = order.getClient().getId();
        //   this.orderItems = order.getOrderItems();
        this.totalPrice = order.getPrice();
    }
}
