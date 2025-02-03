package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;
    private Long nbPlacesMax;

    @ManyToOne
    @JoinColumn(name = "chaineRestauration_id")
    private ChaineRestauration chaineRestauration;
}