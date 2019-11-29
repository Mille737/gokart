package com.eksamen.gokart.Model;

import javax.validation.constraints.NotNull;

public class Kunde {
    @NotNull
    public String navn;
    String firma;
    String email;
    int nummer;

    public Kunde(String navn, String firma, String email, int nummer) {
        this.navn = navn;
        this.firma = firma;
        this.email = email;
        this.nummer = nummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
}
