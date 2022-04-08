package ru.gb.CRMpsy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.CRMpsy.dtos.ClientDto;
import ru.gb.CRMpsy.entities.Client;
import ru.gb.CRMpsy.entities.Order;
import ru.gb.CRMpsy.entities.Psychologies;
import ru.gb.CRMpsy.factory.creating_reports.AbstractReportMaker;
import ru.gb.CRMpsy.factory.creating_reports.BirthdayReport;
import ru.gb.CRMpsy.factory.creating_reports.PsychologiesReport;
import ru.gb.CRMpsy.repository.ClientRepository;
import ru.gb.CRMpsy.repository.ClientRepositoryJDBC;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClientService {
    //private final ClientRepository clientRepository;
    private final ClientRepositoryJDBC clientRepositoryJDBC;
    private final OrderService orderService;
    private final PsychologiesService psychologiesService;
    //Lesson 5 реализован патерн Template Method (Шаблонный метод). Создан основной классов для отчетов (AbstractReportMaker) и его реализации BirthdayReport и ProductReport.
    // Менеджер создает отчеты на основе данных. Есть стандартный шаблон отчета, часть которого формируется у всех одинаково (footer), а часть (header и body) разная для разных вариантов отчетов

    public List<ClientDto> findAllByBirthday(int day, int month) throws SQLException {
        List<Client> clients = clientRepositoryJDBC.findAllByBirthDayAndBirthMonth(day, month);
                return clients.stream().map(ClientDto::new).collect(Collectors.toList());
    }

    public List<ClientDto> findAllByPsychologiesId(Long psychologiesId) throws SQLException {
        List<Order> orders = orderService.findAllOrdersByPsychologiesId(psychologiesId);
        List<Client> clients = new ArrayList<>();
        for (Order o : orders) {
            clients.add(clientRepositoryJDBC.findById(o.getClientId()));
        }
        return clients.stream().map(ClientDto::new).collect(Collectors.toList());
    }

    public void makeReport(String name, List<ClientDto> clients, ReportType type, Object... objects ){
        AbstractReportMaker abstractReportMaker;
        switch (type){
            case BIRTH:
                abstractReportMaker = new BirthdayReport();
                abstractReportMaker.makeReport(name,clients);
                break;
            case BONUS:
                abstractReportMaker = new PsychologiesReport();
                Psychologies psychologies = psychologiesService.findById((Long)objects[0]);
                abstractReportMaker.makeReport(name, clients, psychologies);
                break;
            default:
                throw new IllegalArgumentException("Illegal Type");
        }
    }

    public enum ReportType{
        BIRTH, BONUS
    }
}
