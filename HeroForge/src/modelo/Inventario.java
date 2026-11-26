/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 2DAM
 */
public class Inventario {
    private int id;
    private int personajeId;
    private int objetoId;
    private int cantidad;
    private boolean equipado;

    public Inventario() {
    }

    public Inventario(int id, int personajeId, int objetoId, int cantidad, boolean equipado) {
        this.id = id;
        this.personajeId = personajeId;
        this.objetoId = objetoId;
        this.cantidad = cantidad;
        this.equipado = equipado;
    }

    public Inventario(int personajeId, int objetoId, int cantidad, boolean equipado) {
        this.personajeId = personajeId;
        this.objetoId = objetoId;
        this.cantidad = cantidad;
        this.equipado = equipado;
    }

    public int getId() {
        return id;
    }

    public int getPersonajeId() {
        return personajeId;
    }

    public int getObjetoId() {
        return objetoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean isEquipado() {
        return equipado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPersonajeId(int personajeId) {
        this.personajeId = personajeId;
    }

    public void setObjetoId(int objetoId) {
        this.objetoId = objetoId;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setEquipado(boolean equipado) {
        this.equipado = equipado;
    }

    @Override
    public String toString() {
        return "Inventario{" + "id=" + id + ", personajeId=" + personajeId + ", objetoId=" + objetoId + ", cantidad=" + cantidad + ", equipado=" + equipado + '}';
    }
    
    
    
}
