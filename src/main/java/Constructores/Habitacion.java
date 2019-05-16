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
public class Habitacion {

    private int id;
    private String numero;
    private String tipo;
    private String estado;
    private String precio;

    public Habitacion(String numero, String tipo, String estado, String precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
    }

    public Habitacion(int id, String numero, String tipo, String estado, String precio) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
