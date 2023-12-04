package com.example.bai_tap_1.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column(name = "USER_NAME")
    private String username;
    @Column(name = "ENCRYTED_PASSWORD")
    private String password;
    @Column(name = "ENABLED")
    private boolean enabled;
    @OneToMany(mappedBy = "appUser")
    private Set<UserRole> userRole;
}
