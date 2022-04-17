package ru.gb.balyanova.spring.web.core.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.balyanova.spring.web.core.entities.OrderItem;
import ru.gb.balyanova.spring.web.core.entities.Psychologies;
import ru.gb.balyanova.spring.web.core.repository.OrderItemRepositoryJDBC;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemService {
    //private final OrderItemRepository orderItemRepository;
    private final OrderItemRepositoryJDBC orderItemRepositoryJDBC;

    public List<OrderItem> findAllByPsychologies(Psychologies psychologies) {
        return orderItemRepositoryJDBC.findAllByPsychologiesId(psychologies.getId());
    }
}