package ru.gb.balyanova.spring.web.core.dtos;

public class Letter {
    private String message;
    private String address;
    private String phone;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Letter() {
    }

    public Letter(String address, String message, String phone) {
        this.address = address;
        this.message = message;
        this.phone = phone;
    }
}
