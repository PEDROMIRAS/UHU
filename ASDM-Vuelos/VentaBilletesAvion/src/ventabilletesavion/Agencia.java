/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventabilletesavion;



/**
 *
 * @author pmira
 */

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private static Agencia instancia;
    private List<Vuelo> vuelosCreados;

    private Agencia() {
        vuelosCreados = new ArrayList<>();
    }

    public static Agencia getInstancia() {
        if (instancia == null) {
            instancia = new Agencia();
        }
        return instancia;
    }

    public void crearVuelo(String tipoAvion, int plazasDisponibles) {
        Vuelo vuelo = new Vuelo(tipoAvion, plazasDisponibles);
        vuelosCreados.add(vuelo);
        System.out.println("Vuelo creado: " + vuelo);
    }

    public void devolverBillete(Vuelo vuelo, Cliente cliente, int cantidad) {
        if (vuelo != null && cliente != null && cantidad > 0) {
            cliente.devolverBillete(vuelo, cantidad);
            System.out.println("Billetes devueltos con éxito para el vuelo: " + vuelo);
        } else {
            System.out.println("Error al devolver billetes.");
        }
    }

    public List<Vuelo> getVuelosCreados() {
        return vuelosCreados;
    }
}













