package p6asdm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class P6ASDM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzeriaFacade pizzeria = new Pizzeria();
        
        Cliente cliente = pizzeria.identificarORegistrarCliente();
        
        System.out.println("Seleccione el orden para mostrar el catálogo (natural, pila, cola, ascendente, descendente):");
        Scanner scanner = new Scanner(System.in);
        String orden = scanner.nextLine();
        pizzeria.verCatalogo(orden);
        
        System.out.println("Ingrese el nombre de la pizza que desea ordenar:");
        String nombrePizza = scanner.nextLine();
        
        // Obtener el precio de la pizza elegida , tener en cuenta que hay que poner Pizza Peperoni o "Pizza...." pero siempre es pizza y el nombre 
        double precioPizza = pizzeria.obtenerPrecioPizza(nombrePizza);
        if (precioPizza != -1) {
            pizzeria.realizarPedido(cliente, nombrePizza, precioPizza);
            
            System.out.println("¿Desea agregar ingredientes extra a su pizza? (S/N):");
            String respuesta = scanner.nextLine().toUpperCase();
            if (respuesta.equals("S")) {
                Pizza pizzaSeleccionada = pizzeria.buscarPizza(nombrePizza);
                if (pizzaSeleccionada != null) {
                    System.out.println("Pizza seleccionada: " + pizzaSeleccionada.getNombre());
                    System.out.println("Precio base: " + pizzaSeleccionada.getPrecio());
                    
                    Pizza pizzaConIngredientesExtra = new PeperoniDecorator(new QuesoExtraDecorator(pizzaSeleccionada));
                    System.out.println("Pizza con ingredientes extra: " + pizzaConIngredientesExtra.getNombre());
                    System.out.println("Precio total: " + pizzaConIngredientesExtra.getPrecio());
                } else {
                    System.out.println("La pizza seleccionada no está disponible en el catálogo.");
                }
            } else {
                System.out.println("Gracias por su pedido.");
            }
        } else {
            System.out.println("La pizza seleccionada no está disponible en el catálogo.");
        }
    }  
}

