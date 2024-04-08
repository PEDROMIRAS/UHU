/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventabilletesavion;

/**
 *
 * @author pmira
 */
import javax.swing.JOptionPane;
import java.util.List;

public class VentaBilletesAvion {
    public static void main(String[] args) {
        Agencia agencia = Agencia.getInstancia();

        while (true) {
            String[] opciones = {"Crear Vuelo", "Comprar Billete", "Devolver Billete", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "Menú Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion == 0) { // Crear Vuelo
                String tipoAvion = JOptionPane.showInputDialog(null, "Ingrese el tipo de avión:", "Crear Vuelo", JOptionPane.QUESTION_MESSAGE);
                int plazasDisponibles = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de plazas disponibles:", "Crear Vuelo", JOptionPane.QUESTION_MESSAGE));
                agencia.crearVuelo(tipoAvion, plazasDisponibles);
            } else if (seleccion == 1) { // Comprar Billete
    Cliente cliente = new Cliente();
    List<Vuelo> vuelosCreados = agencia.getVuelosCreados();
    if (!vuelosCreados.isEmpty()) {
        String[] vuelosDisponibles = new String[vuelosCreados.size()];
        for (int i = 0; i < vuelosCreados.size(); i++) {
            vuelosDisponibles[i] = vuelosCreados.get(i).getTipoAvion();
        }
        String vueloSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione un vuelo:", "Comprar Billete", JOptionPane.QUESTION_MESSAGE, null, vuelosDisponibles, vuelosDisponibles[0]);
        Vuelo vuelo = vuelosCreados.stream().filter(v -> v.getTipoAvion().equals(vueloSeleccionado)).findFirst().orElse(null);
        if (vuelo != null) {
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de billetes que desea comprar:", "Comprar Billete", JOptionPane.QUESTION_MESSAGE));
            cliente.comprarBillete(vuelo, cantidad); // Corregir la llamada al método
        } else {
            JOptionPane.showMessageDialog(null, "Vuelo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "No hay vuelos disponibles para comprar billetes", "Error", JOptionPane.ERROR_MESSAGE);
    }
} else if (seleccion == 2) { // Devolver Billete
                Cliente cliente = new Cliente();
                List<Vuelo> vuelosCreados = agencia.getVuelosCreados();
                if (!vuelosCreados.isEmpty()) {
                    String[] vuelosDisponibles = new String[vuelosCreados.size()];
                    for (int i = 0; i < vuelosCreados.size(); i++) {
                        vuelosDisponibles[i] = vuelosCreados.get(i).getTipoAvion();
                    }
                    String vueloSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione un vuelo:", "Devolver Billete", JOptionPane.QUESTION_MESSAGE, null, vuelosDisponibles, vuelosDisponibles[0]);
                    Vuelo vuelo = vuelosCreados.stream().filter(v -> v.getTipoAvion().equals(vueloSeleccionado)).findFirst().orElse(null);
                    if (vuelo != null) {
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de billetes que desea devolver:", "Devolver Billete", JOptionPane.QUESTION_MESSAGE));
                        agencia.devolverBillete(vuelo, cliente, cantidad);

                    } else {
                        JOptionPane.showMessageDialog(null, "Vuelo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay vuelos disponibles para devolver billetes", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (seleccion == 3) { // Salir
                break;
            }
        }
    }
}

