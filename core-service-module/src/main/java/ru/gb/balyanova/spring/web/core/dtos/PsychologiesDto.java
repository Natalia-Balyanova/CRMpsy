package ru.gb.balyanova.spring.web.core.dtos;

import ru.gb.balyanova.spring.web.core.entities.Psychologies;

public class PsychologiesDto {

    private Long id;
    private String name;
    private String surname;
    private int birthday;
    private String email;
    private String method;
    private String problemTitle;
    private int price;

    public PsychologiesDto(){}

    public PsychologiesDto(Long id, String name, String surname, int birthday, String email, String method, String problemTitle) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.email = email;
        this.method = method;
        this.problemTitle = problemTitle;//psychologies.getProblems().stream().map(ProblemsDto::new).collect(Collectors.toList());
    }

    public PsychologiesDto(Long id, String problemTitle, String method, int birthday) {
        this.id = id;
        this.birthday = birthday;
        this.method = method;
        this.problemTitle = problemTitle;
    }

    public PsychologiesDto(Psychologies psychologies) {
        this.id = psychologies.getId();
        this.name = psychologies.getName();
        this.surname = psychologies.getSurname();
        this.birthday = psychologies.getBirthday();
        this.email = psychologies.getEmail();
        this.method = psychologies.getMethod();
        this.problemTitle = psychologies.getProblemTitle();
        this.price = psychologies.getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getProblemsTitle() {
        return problemTitle;
    }

    public void setProblemsTitle(String problemsTitle) {
        this.problemTitle = problemsTitle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
