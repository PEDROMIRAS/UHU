/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

/**
 *
 * @author pmira
 */
public class PedidoRecoger implements PedidoSolicitud{
   private Pedido pedido;
   
   public PedidoRecoger(Pedido pedido){
       this.pedido=pedido;
   }

    @Override
    public void ejecutar() {
        System.out.println("Enviando pedido a cocina para recoger: "+pedido.getPizza());
    }
}
