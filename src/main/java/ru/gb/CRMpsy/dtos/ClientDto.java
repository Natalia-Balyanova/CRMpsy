package ru.gb.CRMpsy.dtos;

import ru.gb.CRMpsy.entities.Client;

public class ClientDto {

    private Long id;
    private String name;
    private String birthday;
    private String email;
    private String phone;
    // private List<OrderDto> orders;

    public ClientDto(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.birthday = client.getBirthday();
        this.email = client.getEmail();
        this.phone= client.getPhone();
        // this.orders = customer.getOrders().stream().map(OrderDto::new).collect(Collectors.toList());
    }
}
