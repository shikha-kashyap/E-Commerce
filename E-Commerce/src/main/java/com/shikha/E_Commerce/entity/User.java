package com.shikha.E_Commerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "user_id")

    private int id;

    @Column (name = "username", length = 50, nullable = false, unique = true)
    private String username;

    @Column (name = "email" , length = 100, nullable = false, unique = true)
    private String email;

    @Column (name = "password", nullable = false)
    private String password;

    @Column (name = "enabled")
    private Boolean enabled = true;

    @Column (name = "created_at" )
    @CreationTimestamp
    private LocalDateTime createdAt;
}
