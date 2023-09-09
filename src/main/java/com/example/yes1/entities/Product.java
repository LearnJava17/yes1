package com.example.yes1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.example.yes1.entities.Product;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "manufacturing_date")
//    @Temporal(TemporalType.DATE)
    private LocalDate manufacturingDate;

    @Column(name = "expiration_date")
  //  @Temporal(TemporalType.DATE)
   private LocalDate expirationDate;

    @Column(name = "is_on_Sale")
    private boolean isOnSale;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "quantity")
    private Integer quantity;

    @OneToMany(mappedBy = "products", fetch = FetchType.EAGER)
    private List<Categories> categories = new ArrayList<>();

}