package ru.gb.balyanova.spring.web.core.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
    private Long id;
    private Long clientId;
    private int price;
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

//@Entity
//@Data
//@NoArgsConstructor
//@Table(name = "orders")
//public class Order {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "client_id")
//    private Client client;
//
////    @OneToMany(mappedBy = "order")
////    private List <OrderItem> orderItems;
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
//}
