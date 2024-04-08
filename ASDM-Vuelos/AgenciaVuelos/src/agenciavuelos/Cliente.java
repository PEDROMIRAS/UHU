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
public class Cliente {
    private List<Billete> billetes;

    public Cliente() {
        billetes = new ArrayList<>();
    }

    public void comprarBillete(Vuelo vuelo, int numPlazas) {
        // Comprobar si el vuelo tiene suficientes plazas disponibles
        if (vuelo.getNumPlazas() < numPlazas) {
            System.out.println("No hay suficientes plazas disponibles en este vuelo.");
            return;
        }

        // Restar el número de plazas al vuelo
        vuelo.setNumPlazas(vuelo.getNumPlazas() - numPlazas);

        // Añadir el billete al cliente
        billetes.add(new Billete(vuelo, numPlazas));
    }

    public void devolverBillete(Vuelo vuelo, int numPlazas) {
        // Comprobar si el cliente tiene un billete de este vuelo
        Billete billete = null;
        for (Billete b : billetes) {
            if (b.getVuelo() == vuelo) {
                billete = b;
                break;
            }
        }
        if (billete == null) {
            System.out.println("No tienes ningún billete de este vuelo.");
            return;
        }

        // Comprobar si el número de plazas a devolver es menor o igual que el número de plazas del billete
        if (numPlazas > billete.getPlazas()) {
            System.out.println("No puedes devolver más plazas de las que tienes en el billete.");
            return;
        }

        // Sumar el número de plazas al vuelo
        vuelo.setNumPlazas(vuelo.getNumPlazas() + numPlazas);

        // Restar el número de plazas al billete
        billete.setPlazas(billete.getPlazas() - numPlazas);

        // Si el número de plazas del billete es 0, eliminarlo del cliente
        if (billete.getPlazas() == 0) {
            billetes.remove(billete);
        }
    }
}

