package com.eksamen.gokart.Model;
import java.sql.*;

public class Booking {
    Date dato;
    Time tid;
    int pax;
    int varighed;
    String kommentar;

    public Booking(Date dato, Time tid, int PAX, int varighed, String kommentar) {
        this.dato = dato;
        this.tid = tid;
        this.pax = pax;
        this.varighed = varighed;
        this.kommentar = kommentar;
    }

    public Date getDato() {
        return dato;
    }

    public void setDato(Date dato) {
        this.dato = dato;
    }

    public Time getTid() {
        return tid;
    }

    public void setTid(Time tid) {
        this.tid = tid;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public int getVarighed() {
        return varighed;
    }

    public void setVarighed(int varighed) {
        this.varighed = varighed;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }
}
