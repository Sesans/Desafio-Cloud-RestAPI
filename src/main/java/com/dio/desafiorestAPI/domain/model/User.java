package com.dio.desafiorestAPI.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_client")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 30)
    private String name;
    @Column(nullable = false, length = 20, unique = true)
    private int account_number;
    @Column(nullable = false, unique = true, scale = 10)
    private BigDecimal card_number;
}
