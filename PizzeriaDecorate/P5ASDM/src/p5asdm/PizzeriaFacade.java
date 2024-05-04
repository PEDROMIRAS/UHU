/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p5asdm;

/**
 *
 * @author pmira
 */
public interface PizzeriaFacade {
    void identificarCliente(String nombre, String direccion);
    void verCatalogo();
    void realizarPedido(String pizza);
    void identificarORegistrarCliente();
    void registrarNuevoCliente();
}
