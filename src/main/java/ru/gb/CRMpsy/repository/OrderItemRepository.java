package ru.gb.CRMpsy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import ru.gb.CRMpsy.entities.OrderItem;
import ru.gb.CRMpsy.entities.Psychologies;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    List<OrderItem> findAllByPsychologies(Psychologies psychologies);
}
