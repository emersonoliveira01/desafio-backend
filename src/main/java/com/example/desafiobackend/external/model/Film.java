package com.example.desafiobackend.external.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "film")
@Data
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private String title;

    private Integer version;

    @ManyToOne
    @JoinColumn(name = "saga_id")
    @JsonIgnore
    private Saga saga;

    @OneToOne()
    @JoinColumn(name = "detail_id")
    @JsonIgnore
    private Detail detail;

}
