package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="travels")
@Data
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dest_id", nullable = false)
    private Long dest_id;
    @Column(name = "state", nullable = false)
    private String state;
    @Column(name = "vehicle_id", nullable = false)
    private Long vehicle_id;

}
