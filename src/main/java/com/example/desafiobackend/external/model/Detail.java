package com.example.desafiobackend.external.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "detail")
@Data
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_create")
    private String DateCreate;
    private String duration;
    private String director;
    private String producer;

    @OneToOne()
    @JsonIgnore
    private Film film;

}
