package com.example.agendapersonalpersitnacia;

public class Contacto {
    //Atributos de la clase Contacto
    private int id;
    private String nombre;
    private String movil;
    private String email;

    //Constructor de la clase Contacto con sus parametros
    public Contacto(int id, String nombre, String movil, String email) {
        this.id = id;
        this.nombre = nombre;
        this.movil = movil;
        this.email = email;
    }

    //Getters y Setters de la clase Contacto de cada uno de los atributos privados creados arriba
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
