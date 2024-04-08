/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenciavuelos;



import javax.swing.JOptionPane;

/**
 *
 * @author pmira
 */

public class AgenciaVuelos {

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        Cliente cliente = new Cliente();
    
        // Crear vuelos usando el patrón Factory Method
        agencia.crearVuelo(new VueloAirbusA318Factory());
        agencia.crearVuelo(new VueloAirbusA319Factory());
        agencia.crearVuelo(new VueloAirbusA320Factory());
        agencia.crearVuelo(new VueloAirbusA321Factory());
    
        while (true) {
            String[] opciones = {"Comprar billete", "Devolver billete", "Salir"};
            String opcion = (String) JOptionPane.showInputDialog(null, "Introduzca la opción deseada:", "Menú principal", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
    
            switch (opcion) {
                case "Comprar billete":
                    comprarBillete(agencia, cliente);
                    break;
                case "Devolver billete":
                    devolverBillete(agencia, cliente);
                    break;
                case "Salir":
                    System.out.println("Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, introduzca una opción válida.");
            }
        }
    }
    
    public static void comprarBillete(Agencia agencia, Cliente cliente) {
        String[] opciones = {"A318", "A319", "A320", "A321", "Salir"};
        String tipoVuelo = (String) JOptionPane.showInputDialog(null, "Introduzca el tipo de vuelo:", "Compra de billetes", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
    
        if (tipoVuelo.equalsIgnoreCase("salir")) {
            return;
        }
    
        int numPlazas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el número de plazas que desea:"));
    
         Vuelo vuelo = null;
        switch (tipoVuelo) {
            case "A318":
                vuelo = agencia.obtenerVueloPorTipo("A318");
                break;
            case "A319":
                vuelo = agencia.obtenerVueloPorTipo("A319");
                break;
            case "A320":
                vuelo = agencia.obtenerVueloPorTipo("A320");
                break;
            case "A321":
                vuelo = agencia.obtenerVueloPorTipo("A321");
                break;
            default:
                System.out.println("Tipo de vuelo no válido.");
                break;
        }
   
        if (vuelo == null) {
            System.out.println("No hay vuelos disponibles de ese tipo.");
            return;
        }
     
        System.out.println("¿Desea comprar un billete de este vuelo?");
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea comprar un billete de este vuelo?", "Confirmación", JOptionPane.YES_NO_OPTION);
    
        if (respuesta == JOptionPane.YES_OPTION) {
            cliente.comprarBillete(vuelo, numPlazas);
        } else {
            System.out.println("No se ha comprado ningún billete.");
        }
    }
    
    public static void devolverBillete(Agencia agencia, Cliente cliente) {
        String[] opciones = {"A318", "A319", "A320", "A321", "Salir"};
        String tipoVuelo = (String) JOptionPane.showInputDialog(null, "Introduzca el tipo de vuelo:", "Devolución de billetes", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
    
        if (tipoVuelo.equalsIgnoreCase("salir")) {
            return;
        }
    
        int numPlazas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el número de plazas que desea devolver:"));
    
        Vuelo vuelo = null;
        switch (tipoVuelo) {
            case "A318":
                vuelo = agencia.obtenerVueloPorTipo("A318");
                break;
            case "A319":
                vuelo = agencia.obtenerVueloPorTipo("A319");
                break;
            case "A320":
                vuelo = agencia.obtenerVueloPorTipo("A320");
                break;
            case "A321":
                vuelo = agencia.obtenerVueloPorTipo("A321");
                break;
            default:
                System.out.println("Tipo de vuelo no válido.");
                break;
        }
    
        if (vuelo == null) {
            System.out.println("No hay vuelos disponibles de ese tipo.");
            return;
        }
    
        System.out.println("¿Desea devolver un billete de este vuelo?");
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea devolver un billete de este vuelo?", "Confirmación", JOptionPane.YES_NO_OPTION);
    
        if (respuesta == JOptionPane.YES_OPTION) {
            cliente.devolverBillete(vuelo, numPlazas);
        } else {
            System.out.println("No se ha devuelto ningún billete.");
        }
    }
}
