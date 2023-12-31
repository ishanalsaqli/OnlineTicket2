package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="destinations")
@Getter
@Setter
@RequiredArgsConstructor
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "from_reg", nullable = false)
    private Long from_reg;
    @Column(name = "to_reg", nullable = false)
    private Long to_reg;
    @Column(name = "price", nullable = false)
    private Long price;

}
