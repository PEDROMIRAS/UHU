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
        double precioTotal=0;
        PizzeriaFacade pizzeria = new Pizzeria();
        
        Cliente cliente = pizzeria.identificarORegistrarCliente();
        
        System.out.println("Seleccione el orden para mostrar el catálogo (natural, pila, cola, ascendente, descendente):");
        Scanner scanner = new Scanner(System.in);
        String orden = scanner.nextLine();
        pizzeria.verCatalogo(orden);
        
        System.out.println("Ingrese el nombre de la pizza que desea ordenar:");
        String nombrePizza = scanner.nextLine();
        
        // Obtener el precio de la pizza elegida
        double precioPizza = pizzeria.obtenerPrecioPizza(nombrePizza);
        if (precioPizza != -1) {
            pizzeria.realizarPedido(cliente, nombrePizza, precioPizza);
            
            System.out.println("¿Desea agregar ingredientes extra a su pizza? (S/N):");
            String respuesta = scanner.nextLine().toUpperCase();
            if (respuesta.equals("S")) {
                System.out.println("Seleccione los ingredientes extra (peperoni, queso extra, ninguno):");
                String ingredientesExtra = scanner.nextLine().toLowerCase();
                Pizza pizzaSeleccionada = pizzeria.buscarPizza(nombrePizza);
                if (pizzaSeleccionada != null) {
                    System.out.println("Pizza seleccionada: " + pizzaSeleccionada.getNombre());
                    System.out.println("Precio base: " + pizzaSeleccionada.getPrecio());
                    
                    Pizza pizzaConIngredientesExtra = pizzaSeleccionada; // Por defecto, la pizza sin ingredientes extra
                    precioTotal = pizzaSeleccionada.getPrecio(); // Por defecto, el precio base de la pizza
                    
                    switch (ingredientesExtra) {
                        case "peperoni":
                            pizzaConIngredientesExtra = new PeperoniDecorator(pizzaSeleccionada);
                            precioTotal = pizzaConIngredientesExtra.getPrecio();
                            break;
                        case "queso extra":
                            pizzaConIngredientesExtra = new QuesoExtraDecorator(pizzaSeleccionada);
                            precioTotal = pizzaConIngredientesExtra.getPrecio();
                            break;
                        case "ninguno":
                            // No se agregan ingredientes extra, el precio total permanece igual
                            break;
                        default:
                            System.out.println("Opción de ingredientes extra no válida. Se continuará sin agregar ingredientes extra.");
                            break;
                    }
                    
                    System.out.println("Pizza con ingredientes extra: " + pizzaConIngredientesExtra.getNombre());
                    System.out.println("Precio total: " + precioTotal);
                } else {
                    System.out.println("La pizza seleccionada no está disponible en el catálogo.");
                    return;
                }
            } else {
                // Si el cliente no desea agregar ingredientes extra, el precio total será igual al precio base
                precioTotal = precioPizza;
                System.out.println("Precio total: " + precioTotal);
            }
            
            // Después de seleccionar los ingredientes extra (o no), se pregunta por el tipo de pedido
            System.out.println("Seleccione el tipo de pedido (domicilio, mesa, recoger):");
            String tipoPedido = scanner.nextLine().toLowerCase();
            Pedido pedido = new Pedido(nombrePizza, precioTotal);
            PedidoSolicitud pedidoSolicitud = null;
            switch (tipoPedido) {
                case "domicilio":
                    //System.out.println("Pedido: Domicilio");
                    pedidoSolicitud = new PedidoDomicilio(pedido);
                    break;
                case "mesa":
                    //System.out.println("Pedido: Mesa");
                    pedidoSolicitud = new PedidoMesa(pedido);
                    break;
                case "recoger":
                    //System.out.println("Pedido: Recoger");
                    pedidoSolicitud = new PedidoRecoger(pedido);
                    break;
                default:
                    System.out.println("Tipo de pedido no reconocido.");
                    break;
            }
            if (pedidoSolicitud != null) {
                pizzeria.aceptarPedido(pedidoSolicitud);
            }
        } else {
            System.out.println("La pizza seleccionada no está disponible en el catálogo.");
        }
    }
}
    

