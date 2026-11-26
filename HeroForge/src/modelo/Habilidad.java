/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 2DAM
 */
public class Habilidad {
    private int id;
    private int personajeId;
    private String nombre;
    private int nivel;
    private String descripcion;

    public Habilidad() {
    }

    public Habilidad(int id, int personajeId, String nombre, int nivel, String descripcion) {
        this.id = id;
        this.personajeId = personajeId;
        this.nombre = nombre;
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    public Habilidad(int personajeId, String nombre, int nivel, String descripcion) {
        this.personajeId = personajeId;
        this.nombre = nombre;
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public int getPersonajeId() {
        return personajeId;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPersonajeId(int personajeId) {
        this.personajeId = personajeId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Habilidad{" + "id=" + id + ", personajeId=" + personajeId + ", nombre=" + nombre + ", nivel=" + nivel + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
