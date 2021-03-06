package ru.gb.CRMpsy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.CRMpsy.dtos.OrderDto;
import ru.gb.CRMpsy.entities.Order;
import ru.gb.CRMpsy.entities.OrderItem;
import ru.gb.CRMpsy.repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderItemService orderItemService;
    private final PsychologiesService psychologiesService;

    public List<Order> findAllOrdersByPsychologiesId(Long psychologiesId) {
        List<OrderItem> orderItems = orderItemService.findAllByPsychologies(psychologiesService.findById(psychologiesId));
        List<Order> orders = new ArrayList<>();
        for (OrderItem oi : orderItems) {
            orders.add(oi.getOrder());
        }
        return orders;
    }

    public List<OrderDto> findAll() {
        return orderRepository.findAll().
                stream().map(OrderDto::new).collect(Collectors.toList());
    }
}