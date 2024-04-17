/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2asdm;

/**
 *
 * @author pedromiras
 */
public class Billete {
    private final Usuario usuario;
    private final Vuelo vuelo;

    public Billete(Usuario usuario, Vuelo vuelo) {
        this.usuario = usuario;
        this.vuelo = vuelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
}

