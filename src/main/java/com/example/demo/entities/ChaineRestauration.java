package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;

    private String libelle;
    private LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestauration", cascade = CascadeType.ALL)
    private List<Restaurant> restaurant;
}
