package com.uninter.baozistore.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long clienteId; // Conforme o diagrama exigido pela Uninter
    private Long produtoId; // Conforme o diagrama exigido pela Uninter
    private Integer quantidade;
}