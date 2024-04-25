/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pizzeria;

import java.util.Scanner;

/**
 *
 * @author pmira
 */
public class P4ASDM {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        Pizzeria pizzeria = new Pizzeria();

        pizzeria.identificarORegistrarCliente();
        
        pizzeria.verCatalogo();

        // Realizar un pedido (solicitando al usuario que ingrese la pizza)
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que pizza desea pedir?");
        String pizzaPedido = scanner.nextLine();
        System.out.println("\n");
        pizzeria.realizarPedido(pizzaPedido);

        scanner.close();
    }
}

    

