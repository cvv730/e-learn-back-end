package com.projexacademy.elearnbackend.models;

public enum UserType {
    APPRENANT("apprenant"),FORMATEUR("formateur"),ADMIN("admin");

    UserType(String value) {
        this.value=value;
    }

    public String value;
}
