package ru.gb.CRMpsy.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import ru.gb.CRMpsy.entities.Client;

import java.util.List;

@Repository
public interface ClientRepository {

    List<Client> findAllByBirthDayAndBirthMonth(int birthDay, int month);
}
//Hibernate
//@Repository
//@EnableJpaRepositories
//public interface ClientRepository extends JpaRepository<Client, Long> {
//
//    List<Client> findAllByBirthDayAndBirthMonth(int birthDay, int month);
//}
