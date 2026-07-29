package com.recanto.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dataCheckIn;

    @Column(nullable = false)
    private LocalDate dataCheckOut;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "hospede_id")
    private Hospede hospede;

    @ManyToOne
    @JoinColumn(name = "quarto_id")
    private Quarto quarto;

}