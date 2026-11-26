/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 2DAM
 */
public class Personaje {
    private int id;
    private String nombre;
    private int claseId;
    private int nivel;
    private int fuerza;
    private int agilidad;
    private int inteligencia;
    private String avatar;

    public Personaje(int id, String nombre, int claseId, int nivel, int fuerza, int agilidad, int inteligencia, String avatar) {
        this.id = id;
        this.nombre = nombre;
        this.claseId = claseId;
        this.nivel = nivel;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
        this.avatar = avatar;
    }

    public Personaje() {
    }

    public Personaje(String nombre, int claseId, int nivel, int fuerza, int agilidad, int inteligencia, String avatar) {
        this.nombre = nombre;
        this.claseId = claseId;
        this.nivel = nivel;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getClaseId() {
        return claseId;
    }

    public int getNivel() {
        return nivel;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClaseId(int claseId) {
        this.claseId = claseId;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Personaje{" + "id=" + id + ", nombre=" + nombre + ", claseId=" + claseId + ", nivel=" + nivel + ", fuerza=" + fuerza + ", agilidad=" + agilidad + ", inteligencia=" + inteligencia + ", avatar=" + avatar + '}';
    }

    
    
    
}
