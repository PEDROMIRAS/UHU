/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5asdm;

/**
 *
 * @author pmira
 */
public class Cliente {
    
    private String nombre;
    private String direccion;
    
 /*
    // Base de datos simulada para almacenar los clientes
    private static Map<String, Cliente> baseDatosClientes = new HashMap<>();
    */
    
    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /*public static boolean verificarExistencia(String nombreCliente) {
        // Verificar si el cliente existe en la base de datos
        return baseDatosClientes.containsKey(nombreCliente);
    }

    public static void darAltaCliente(Cliente nuevoCliente) {
        // Dar de alta al cliente en la base de datos
        baseDatosClientes.put(nuevoCliente.getNombre(), nuevoCliente);
        System.out.println("Cliente " + nuevoCliente.getNombre() + " dado de alta.");
    }*/
}

