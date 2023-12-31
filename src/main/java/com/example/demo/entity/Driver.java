package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="drivers")
@Data
public class Driver  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fin", nullable = false)
    private String fin;
    @Column(name = "fullname", nullable = false)
    private String fullname;
    @Column (name ="serial",nullable = true)
    private String serial;

}
