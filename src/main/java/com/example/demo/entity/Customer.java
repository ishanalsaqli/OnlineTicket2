package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name ="customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "fin", nullable = false)
    private String fin;
    @Column(name = "fullname", nullable = false)
    private String fullname;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "mail", nullable = false)
    private String mail;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "username", nullable = false)
    private String username;

    @PrePersist
    public void prePersist() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        // Encode the password before saving it
        this.password = passwordEncoder.encode(this.password);
    }


}
