/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventabilletesavion;
 /**
 *
 * @author pmira
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Billete> billetesComprados;

    public Cliente() {
        this.billetesComprados = new ArrayList<>();
    }

    public void comprarBillete(Vuelo vuelo, int cantidad) {
        if (vuelo != null && cantidad > 0) {
            int billetesDisponibles = vuelo.getPlazasDisponibles();
            if (billetesDisponibles >= cantidad) {
                for (int i = 0; i < cantidad; i++) {
                    Billete billete = new Billete(vuelo); // Crear un nuevo billete para el vuelo
                    billetesComprados.add(billete); // Agregar el billete comprado al cliente
                }
                vuelo.actualizarPlazasDisponibles(-cantidad); // Actualizar las plazas disponibles en el vuelo
                JOptionPane.showMessageDialog(null, "Se han comprado " + cantidad + " billetes para el vuelo.", "Compra de Billetes", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No hay suficientes billetes disponibles en el vuelo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al comprar billetes.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Billete> getBilletesComprados(Vuelo vuelo) {
        List<Billete> billetesFiltrados = new ArrayList<>();
        for (Billete billete : billetesComprados) {
            if (billete.getVuelo() == vuelo) {
                billetesFiltrados.add(billete);
            }
        }
        return billetesFiltrados;
    }

    public void devolverBillete(Vuelo vuelo, int cantidad) {
        List<Billete> billetesADevolver = new ArrayList<>();

        // Encontrar y eliminar la cantidad de billetes especificada para el vuelo dado
        for (Billete billete : billetesComprados) {
            if (billete.getVuelo().equals(vuelo) && cantidad > 0) {
                billetesADevolver.add(billete);
                cantidad--;
            }
        }

        // Eliminar los billetes de la lista de billetes comprados
        billetesComprados.removeAll(billetesADevolver);

        JOptionPane.showMessageDialog(null, "Billetes devueltos con éxito", "Devolver Billete", JOptionPane.INFORMATION_MESSAGE);
    }
}










