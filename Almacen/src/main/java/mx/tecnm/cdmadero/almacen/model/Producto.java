/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.tecnm.cdmadero.almacen.model;

/**
 *
 * @author Fernando Manzanares
 */
public class Producto {
    String nombre;
    Integer existencia;

    public Producto(String nombre, Integer existencia) {
        this.nombre = nombre;
        this.existencia = existencia;
        
    }

    public Producto() {
        this.nombre = "NOMBRE PENDIENTE";
        this.existencia = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }
    
    
}
