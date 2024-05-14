/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

/**
 *
 * @author pmira
 */
public class PedidoDomicilio implements PedidoSolicitud{
    private Pedido pedido;
    
    public PedidoDomicilio(Pedido pedido){
        this.pedido=pedido;
    }

    @Override
    public void ejecutar() {
        System.out.println("Enviando pedido a la cocina para entregar a domicilio: "+pedido.getPizza());
    }
    
}
