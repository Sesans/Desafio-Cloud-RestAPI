package com.dio.desafiorestAPI.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_book")
public class Book extends BaseItem{
}
