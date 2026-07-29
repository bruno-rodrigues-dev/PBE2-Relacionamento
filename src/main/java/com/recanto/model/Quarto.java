package com.recanto.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Quarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private Integer andar;

    @Column(nullable = false)
    private Integer capacidade;

    @ManyToOne
    @JoinColumn(name = "tipo_quarto_id")
    private TipoQuarto tipoQuarto;

    @OneToMany(mappedBy = "quarto")
    private List<Reserva> reservas;

}