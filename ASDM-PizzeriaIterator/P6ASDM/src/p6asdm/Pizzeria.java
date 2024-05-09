/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author pmira
 */
    public class Pizzeria implements PizzeriaFacade {
    private CatalogoPizzas catalogo;
    private List<Cliente> clientes;

    public Pizzeria() {
        this.catalogo = new CatalogoPizzas();
        this.clientes = new ArrayList<>();
    }

    @Override
    public void identificarCliente(String nombre, String direccion) {
      if (nombre == null || nombre.isEmpty() || direccion == null || direccion.isEmpty()) {
        System.out.println("Error: Nombre y dirección no pueden estar vacíos.");
        return;
    }
       Cliente nuevoCliente = new Cliente(nombre, direccion);
       clientes.add(nuevoCliente); 
       System.out.println("Bienvenido, " + nombre + ". Dirección: " + direccion);
       System.out.println("\n");
    }

    @Override
    public void verCatalogo(String orden) {
    System.out.println("Catálogo de Pizzas:");
    List<Pizza> pizzasOrdenadas = ordenarPizzas(catalogo.obtenerPizzas(), orden);
    for (Pizza pizza : pizzasOrdenadas) {
        // Imprimir el nombre y el precio de la pizza
        System.out.println("Nombre: " + pizza.getNombre());
        System.out.println("Precio: " + pizza.getPrecio());
        // Llamar a los métodos para mostrar ingredientes y preparación
        pizza.mostrarIngredientes();
        pizza.mostrarPreparacion();
        System.out.println();
    }
}

    private List<Pizza> ordenarPizzas(List<Pizza> pizzas, String orden) {
        switch (orden) {
            case "natural":
                return pizzas;
            case "pila":
                return pizzas.stream().sorted(Comparator.comparing(Pizza::getNombre).reversed()).collect(Collectors.toList());
            case "cola":
                return pizzas.stream().sorted(Comparator.comparing(Pizza::getNombre)).collect(Collectors.toList());
            case "ascendente":
                return pizzas.stream().sorted(Comparator.comparingDouble(Pizza::getPrecio)).collect(Collectors.toList());
            case "descendente":
                return pizzas.stream().sorted(Comparator.comparingDouble(Pizza::getPrecio).reversed()).collect(Collectors.toList());
            default:
                System.out.println("Orden no reconocido. Mostrando en orden natural.");
                return pizzas;
        }
    }

    @Override
    public void realizarPedido(Cliente cliente, String pizza, double precio) {
    if (cliente == null) {
        System.out.println("Error: El cliente no puede ser nulo.");
        return;
    }
    if (pizza == null || pizza.isEmpty()) {
        System.out.println("Error: El nombre de la pizza no puede estar vacío.");
        return;
    }
    System.out.println("Pedido realizado: " + pizza);
    Pedido pedido = new Pedido(pizza, precio); // Utilizar el precio proporcionado
    cliente.agregarPedido(pedido); // Agregar el pedido al historial del cliente
    System.out.println("\n");
    }

    // Método para solicitar al usuario que identifique o registre un cliente
    @Override
    public Cliente identificarORegistrarCliente() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("¿Eres un cliente registrado? (S/N)");
    String respuesta = scanner.nextLine().toUpperCase();
    if (respuesta.equals("S")) {
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese su dirección: ");
        String direccionCliente = scanner.nextLine();
        return new Cliente(nombreCliente, direccionCliente);
    } else if (respuesta.equals("N")) {
        registrarNuevoCliente();
        // Después de registrar, solicitamos la identificación nuevamente
        return identificarORegistrarCliente();
    } else {
        System.out.println("Respuesta no válida. Por favor, responda con 'S' o 'N'.");
        // Si la respuesta no es válida, solicitamos la identificación nuevamente
        return identificarORegistrarCliente();
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
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String nombreCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
                return cliente;
            }
        }
        return null; // Cliente no encontrado
    }
    
    @Override
    public void agregarPedidoAlHistorial(String nombreCliente, Pedido pedido) {
        Cliente cliente=buscarCliente(nombreCliente);
        if (cliente!=null) {
            cliente.agregarPedido(pedido);
            System.out.println("Pedido agregado al historial de "+nombreCliente);    
        }else {
            System.out.println("Cliente no encontrado.");
        }
    }
    
    @Override
    public double obtenerPrecioPizza(String nombrePizza) {
       Pizza pizza = buscarPizza(nombrePizza);
        if (pizza != null) {
           return pizza.getPrecio();
        }else {
          return -1; // Indica que la pizza no está en el catálogo
        }
    }
     @Override
    public Pizza buscarPizza(String nombrePizza) {
       for (Pizza pizza : catalogo.obtenerPizzas()) {
          if (pizza.getNombre().equalsIgnoreCase(nombrePizza)) {
            return pizza;
          }
        }
        return null; // La pizza no se encontró en el catálogo
    }
    
}
