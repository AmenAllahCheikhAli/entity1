package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;
    private Float prix;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @OneToOne(mappedBy = "composant", cascade = CascadeType.ALL)
    private DetailComposant detailsComposant;
}
