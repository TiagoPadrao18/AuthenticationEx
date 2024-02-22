package com.authorizationEx.authorzationEx.enums;


public enum Roles {
    USER("User"),
    ADMIN("Admin"),


  final String role;

    Roles(String role) {
        this.role = role;
    }
}
