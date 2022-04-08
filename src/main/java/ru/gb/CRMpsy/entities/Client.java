package ru.gb.CRMpsy.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Client {
    private Long id;
    private String name;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private String phone;
}
//Hibernate realisation
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.Arrays;
//
//@Entity
//@Data
//@NoArgsConstructor
//@Table(name = "clients")
//public class Client {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//    @Column(name = "birth_day")
//    private int birthDay;
//    @Column(name = "birth_month")
//    private int birthMonth;
//    @Column(name = "birth_year")
//    private int birthYear;
//    @Column(name = "email")
//    private String email;
//    @Column(name = "phone")
//    private String phone;
//
////    @OneToMany(mappedBy = "client")
////    private List <Order> orders;
//
//    @CreationTimestamp
//    @Column(name = "created_at")
//    private LocalDateTime createdAt;
//
//    @UpdateTimestamp
//    @Column(name = "updated_at")
//    private LocalDateTime updatedAt;
//}