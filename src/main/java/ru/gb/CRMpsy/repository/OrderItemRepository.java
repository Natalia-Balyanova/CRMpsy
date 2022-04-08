package ru.gb.CRMpsy.repository;

import org.springframework.stereotype.Repository;
import ru.gb.CRMpsy.entities.OrderItem;
import ru.gb.CRMpsy.entities.Psychologies;

import java.util.List;

@Repository
public interface OrderItemRepository {

    List<OrderItem> findAllByPsychologies(Psychologies psychologies);
}
//Hibernate
//@Repository
//@EnableJpaRepositories
//public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
//
//    List<OrderItem> findAllByPsychologies(Psychologies psychologies);
//}
