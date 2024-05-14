/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

/**
 *
 * @author pmira
 */
public class Pedido {
    private String  pizza;
    private double precio;
    
    public Pedido(String pizza, double precio){
        this.pizza=pizza;
        this.precio=precio;
    }
    
    public String getPizza(){
        return pizza;
    }
    
    public void setPizza(String pizza){
        this.pizza=pizza;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
}
