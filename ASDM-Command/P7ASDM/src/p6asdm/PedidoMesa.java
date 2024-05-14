/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

/**
 *
 * @author pmira
 */
public class PedidoMesa implements PedidoSolicitud{
    private Pedido pedido;
    
    public PedidoMesa(Pedido pedido){
        this.pedido=pedido;
    }
    
    @Override
    public void ejecutar(){
        System.out.println("Enviando pedido a cocina para servir en mesa: "+pedido.getPizza());
    }
}
