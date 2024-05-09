/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p6asdm;

/**
 *
 * @author pmira
 */
public interface PizzeriaFacade {
    void identificarCliente(String nombre, String direccion);
    void verCatalogo(String orden);
    void realizarPedido(Cliente cliente, String pizza, double precio);
    Cliente identificarORegistrarCliente();
    void registrarNuevoCliente();
    void agregarPedidoAlHistorial(String nombreCliente, Pedido pedido);
    double obtenerPrecioPizza(String nombrePizza);
    Pizza buscarPizza(String nombrePizza);
}
