package ru.gb.CRMpsy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.CRMpsy.entities.OrderItem;
import ru.gb.CRMpsy.entities.Psychologies;
import ru.gb.CRMpsy.repository.OrderItemRepository;
import ru.gb.CRMpsy.repository.OrderItemRepositoryJDBC;

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