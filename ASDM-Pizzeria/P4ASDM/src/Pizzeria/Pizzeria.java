/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzeria;

import java.util.Scanner;

/**
 *
 * @author pmira
 */
public class Pizzeria implements PizzeriaFacade {
    private CatalogoPizzas catalogo;
    private Cliente cliente;

    public Pizzeria() {
        this.catalogo = new CatalogoPizzas();
        this.cliente = new Cliente("", ""); // Cliente inicial sin nombre ni dirección
    }

    @Override
    public void identificarCliente(String nombre, String direccion) {
        cliente.setNombre(nombre);
        cliente.setDireccion(direccion);
        System.out.println("Bienvenido, " + nombre + " Direccion: " + direccion);
        System.out.println("\n");
    }

    @Override
    public void verCatalogo() {
        System.out.println("Carta de Pizzas:");
        catalogo.mostrarCatalogo();
        System.out.println("\n");
    }

    @Override
    public void realizarPedido(String pizza) {
        System.out.println("Pedido realizado: " + pizza);
        System.out.println("\n");
    }

    // Método para solicitar al usuario que identifique o registre un cliente
    @Override
    public void identificarORegistrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Eres un cliente registrado? (S/N)");
        String respuesta = scanner.nextLine().toUpperCase();
        if (respuesta.equals("S")) {
            System.out.print("Ingrese su nombre: ");
            String nombreCliente = scanner.nextLine();
            System.out.print("Ingrese su direccion: ");
            String direccionCliente = scanner.nextLine();
            identificarCliente(nombreCliente, direccionCliente);
            System.out.println("\n");
        } else {
            registrarNuevoCliente();
        }
    }

    // Método para registrar un nuevo cliente en el sistema
    @Override
    public void registrarNuevoCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese su direccion: ");
        String direccionCliente = scanner.nextLine();
        identificarCliente(nombreCliente, direccionCliente);
    }
}
