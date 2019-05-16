/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

/**
 *
 * @author iUser
 */
public class Cliente {

    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String estado;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String telefono, String direccion, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }

    public Cliente(String nombre, String telefono, String direccion, String estado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cliente(int id) {
        this.id = id;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
