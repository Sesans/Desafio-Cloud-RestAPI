package com.dio.desafiorestAPI.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tb_Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int account_number;
    @Column(nullable = false, unique = true)
    private String client_name;
    @Column(nullable = false, length = 20)
    private String payment_method;
}
