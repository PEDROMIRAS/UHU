/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciavuelos;

/**
 *
 * @author pmira
 */
abstract class Vuelo {
    private int idVuelo;
    private int numPlazas;
    private String tipo;

    public Vuelo(int idVuelo, int numPlazas, String tipo) {
        this.idVuelo= idVuelo;
        this.numPlazas = numPlazas;
        this.tipo = tipo;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void crearVuelo();

    public abstract void devolverBillete();

    void reservarPlazas(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

