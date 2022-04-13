package ru.gb.balyanova.spring.web.core.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.balyanova.spring.web.core.dtos.OrderDto;
import ru.gb.balyanova.spring.web.core.entities.Order;
import ru.gb.balyanova.spring.web.core.entities.OrderItem;
import ru.gb.balyanova.spring.web.core.repository.OrderRepositoryJDBC;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    //private final OrderRepository orderRepository;
    private final OrderRepositoryJDBC orderRepositoryJDBC;
    private final OrderItemService orderItemService;
    private final PsychologiesService psychologiesService;

    public List<Order> findAllOrdersByPsychologiesId(Long psychologiesId) {
        List<OrderItem> orderItems = orderItemService.findAllByPsychologies(psychologiesService.findById(psychologiesId));
        List<Order> orders = new ArrayList<>();
        for (OrderItem oi : orderItems) {
            orders.add(orderRepositoryJDBC.findById(oi.getOrderId()));
        }
        return orders;
    }

    public List<OrderDto> findAll() {
        return orderRepositoryJDBC.findAll().
                stream().map(OrderDto::new).collect(Collectors.toList());
    }
}