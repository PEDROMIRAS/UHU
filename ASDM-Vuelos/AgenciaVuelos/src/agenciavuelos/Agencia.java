/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciavuelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pmira
 */
class Agencia {
    private final List<Vuelo> vuelosCreados;

    public Agencia() {
        vuelosCreados = new ArrayList<>();
    }

    public Vuelo obtenerVueloPorTipo(String tipoVuelo) {
        for (Vuelo vuelo : vuelosCreados) {
            if (vuelo.getTipo().equalsIgnoreCase(tipoVuelo)) {
                return vuelo;
            }
        }
        return null;
    }

    public void crearVuelo(VueloFactory factory) {
        Vuelo vuelo = factory.crearVuelo();
        vuelo.crearVuelo();
        vuelosCreados.add(vuelo);
    }

    public void devolverBillete(Vuelo vuelo) {
        vuelo.devolverBillete();
    }
    
     public List<Vuelo> getVuelosCreados() {
        return vuelosCreados;
    }

    void crearVuelo(Vuelo vuelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}
