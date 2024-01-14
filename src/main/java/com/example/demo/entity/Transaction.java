package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="transactions")
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "issuer", nullable = false)
    private String issuer;
    @Column(name = "receiver", nullable = false)
    private String receiver;
    @Column(name = "trancode", nullable = false)
    private int trancode;
    @Column(name = "amount", nullable = false)
    private double amount;


}
