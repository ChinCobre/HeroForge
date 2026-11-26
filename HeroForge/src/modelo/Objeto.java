/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 2DAM
 */
public class Objeto {
    
    private int id;
    private String nombre;
    private String tipo;
    private int rarezaId;
    private double peso;
    private int bonusFuerza;
    private int bonusAgilidad;
    private int bonusInteligencia;

    public Objeto(int id, String nombre, String tipo, int rarezaId, double peso, int bonusFuerza, int bonusAgilidad, int bonusInteligencia) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.rarezaId = rarezaId;
        this.peso = peso;
        this.bonusFuerza = bonusFuerza;
        this.bonusAgilidad = bonusAgilidad;
        this.bonusInteligencia = bonusInteligencia;
    }

    public Objeto(String nombre, String tipo, int rarezaId, double peso, int bonusFuerza, int bonusAgilidad, int bonusInteligencia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.rarezaId = rarezaId;
        this.peso = peso;
        this.bonusFuerza = bonusFuerza;
        this.bonusAgilidad = bonusAgilidad;
        this.bonusInteligencia = bonusInteligencia;
    }

    public Objeto() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getRarezaId() {
        return rarezaId;
    }

    public double getPeso() {
        return peso;
    }

    public int getBonusFuerza() {
        return bonusFuerza;
    }

    public int getBonusAgilidad() {
        return bonusAgilidad;
    }

    public int getBonusInteligencia() {
        return bonusInteligencia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRarezaId(int rarezaId) {
        this.rarezaId = rarezaId;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setBonusFuerza(int bonusFuerza) {
        this.bonusFuerza = bonusFuerza;
    }

    public void setBonusAgilidad(int bonusAgilidad) {
        this.bonusAgilidad = bonusAgilidad;
    }

    public void setBonusInteligencia(int bonusInteligencia) {
        this.bonusInteligencia = bonusInteligencia;
    }

    @Override
    public String toString() {
        return "Objeto{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", rarezaId=" + rarezaId + ", peso=" + peso + ", bonusFuerza=" + bonusFuerza + ", bonusAgilidad=" + bonusAgilidad + ", bonusInteligencia=" + bonusInteligencia + '}';
    }
    
    
}
