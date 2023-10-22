package com.dio.desafiorestAPI.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_film")
public class Film extends BaseItem{
}
