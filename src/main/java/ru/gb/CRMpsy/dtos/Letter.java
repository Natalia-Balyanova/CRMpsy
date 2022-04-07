package ru.gb.CRMpsy.dtos;

public class Letter {
    private String message;
    private String address;

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

    public Letter() {
    }

    public Letter(String address, String message) {
        this.address = address;
        this.message = message;
    }
}
