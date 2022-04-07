package ru.gb.CRMpsy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.CRMpsy.dtos.ClientDto;
import ru.gb.CRMpsy.entities.Client;
import ru.gb.CRMpsy.entities.Order;
import ru.gb.CRMpsy.repository.ClientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;
    private final OrderService orderService;

    public List<ClientDto> findAllByBirthday(String birthday) {
        return clientRepository.findAllByBirthday(birthday).
                stream().map(ClientDto::new).collect(Collectors.toList());
    }

    public List<ClientDto> findAllByPsychologiesId(Long psychologiesId) {
        List<Order> orders = orderService.findAllOrdersByPsychologiesId(psychologiesId);
        List<Client> clients = new ArrayList<>();
        for (Order o : orders) {
            clients.add(o.getClient());
        }
        return clients.stream().map(ClientDto::new).collect(Collectors.toList());
    }


}
