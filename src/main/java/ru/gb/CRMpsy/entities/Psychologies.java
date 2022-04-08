package ru.gb.CRMpsy.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Psychologies {
    private Long id;
    private String name;
    private String surname;
    private int birthday;
    private String email;
    private String method;
    //private Long problemId;
    private String problemTitle;
    private int price;
    public Psychologies(Long id, String problemTitle, String method, int birthday) {
        this.id = id;
        this.problemTitle = problemTitle;
        this.method = method;
        this.birthday = birthday;
    }
}

//Hibernate realisation
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Entity
//@Data
//@NoArgsConstructor
//@Table(name = "psychologies")
//public class Psychologies {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//    @Column(name = "name")
//    private String name;
//    @Column(name = "surname")
//    private String surname;
//    @Column(name = "birthday")
//    private int birthday;
//    @Column(name = "email")
//    private String email;
//    @Column(name = "school_method")
//    private String method;
//
//    @ManyToOne
//    @JoinColumn(name = "problem_id")
//    private Problem problem;
//
//    @Column(name = "price")
//    private int price;
//
//    @CreationTimestamp
//    @Column(name = "created_at")
//    private LocalDateTime createdAt;
//
//    @UpdateTimestamp
//    @Column(name = "updated_at")
//    private LocalDateTime updatedAt;
//
//    public Psychologies(Long id, String problemTitle, String method, int birthday) {
//        this.id = id;
//        this.problem = problem;
//        this.method = method;
//        this.birthday = birthday;
//    }
//}
