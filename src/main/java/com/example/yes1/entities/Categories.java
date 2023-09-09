package com.example.yes1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "categories")
public class Categories implements Serializable {
    private static final long serialVersionUID = 5329558370942922340L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "creation_date")
    //@Temporal(TemporalType.TIMESTAMP)
    private LocalDate creationDate;

    @Column(name = "image_url")
    private String imageUrl;


    // default fetch type for ManyToOne: EAGER
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product products;

}