package ru.gb.balyanova.spring.web.core.entities;//package ru.gb.CRMpsy.entities;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//public class Problem {
//    private Long id;
//    private String title;
//    private Long psychologiesId;
//}
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
//@Table(name = "problems")
//public class Problem {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "title")
//    private String title;
//
//    @OneToMany(mappedBy = "problem")
//    private List<Psychologies> psychologies;
//
//    @CreationTimestamp
//    @Column(name = "created_at")
//    private LocalDateTime createdAt;
//
//    @UpdateTimestamp
//    @Column(name = "updated_at")
//    private LocalDateTime updatedAt;
//}