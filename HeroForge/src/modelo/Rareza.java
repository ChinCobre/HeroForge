/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 2DAM
 */
public class Rareza {
  private int id;
  private String nombre;

    public Rareza() {
    }

    public Rareza(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Rareza(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Rareza{" + "id=" + id + ", nombre=" + nombre + '}';
    }

    
    
  
}
