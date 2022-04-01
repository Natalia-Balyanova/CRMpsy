package ru.gb.CRMpsy.dtos;

import lombok.Data;
import ru.gb.CRMpsy.entities.Client;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class ClientDto {
    private Long id;
    private String name;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private String phone;
    //private List<OrderDto> orders;

    public ClientDto() {
    }

    public ClientDto(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.birthDay = client.getBirthDay();
        this.birthMonth = client.getBirthMonth();
        this.birthYear = client.getBirthYear();
        this.email = client.getEmail();
        this.phone= client.getPhone();
        //this.orders = client.getOrders().stream().map(OrderDto::new).collect(Collectors.toList());
    }
}
