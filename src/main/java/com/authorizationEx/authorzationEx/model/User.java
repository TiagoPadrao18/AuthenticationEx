package com.authorizationEx.authorzationEx.model;

import com.authorizationEx.authorzationEx.enums.Roles;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "\"user\"")
@Data
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;

    @Enumerated(EnumType.STRING)
    private Roles role;



}
