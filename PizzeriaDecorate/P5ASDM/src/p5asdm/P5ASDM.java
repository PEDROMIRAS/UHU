/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p5asdm;

import java.util.Scanner;

/**
 *
 * @author pmira
 */
public class P5ASDM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzeriaFacade pizzeria = new Pizzeria();

        // Solicitar al cliente que se identifique o se registre
        pizzeria.identificarORegistrarCliente();

        // Mostrar el catálogo de pizzas disponibles
        pizzeria.verCatalogo();

        // Solicitar al cliente que elija una pizza
        System.out.print("Ingrese el nombre de la pizza que desea: ");
        String pizzaElegida = scanner.nextLine();

        // Solicitar al cliente que elija si desea extras
        System.out.print("¿Desea agregar extras a su pizza? (S/N): ");
        String respuesta = scanner.nextLine().toUpperCase();

        // Realizar el pedido
        if (respuesta.equals("S")) {
            System.out.println("¿Qué extras desea agregar?");
            System.out.println("1. Pepperoni");
            System.out.println("2. Queso extra");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Crear una pizza base según la elección del cliente
            Pizza pizza = null;
            switch (pizzaElegida.toLowerCase()) {
                case "peperoni":
                    pizza = new PizzaPeperoni();
                    break;
                case "cuatro quesos":
                    pizza = new PizzaCuatroQuesos();
                    break;
                case "barbacoa":
                    pizza = new PizzaBarbacoa();
                    break;
                case "marinera":
                    pizza = new PizzaMarinera();
                    break;
                default:
                    System.out.println("Lo siento, no tenemos esa pizza en el menú.");
                    return;
            }

            // Agregar extras a la pizza según la elección del cliente
            switch (opcion) {
                case 1:
                    pizza = new PeperoniDecorator(pizza);
                    break;
                case 2:
                    pizza = new QuesoExtraDecorator(pizza);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }

            // Realizar el pedido con la pizza seleccionada y los extras agregados
            pizzeria.realizarPedido(pizzaElegida);
        } else if (respuesta.equals("N")) {
            // Realizar el pedido sin extras
            pizzeria.realizarPedido(pizzaElegida);
        } else {
            System.out.println("Respuesta no válida.");
        }
    }
    
}
