/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

/**
 *
 * @author pmira
 */
public class PizzaCuatroQuesos implements Pizza {
    
    private static final String NOMBRE = "Pizza de Cuatro Quesos";
    private static final double PRECIO = 11.99;

    @Override
    public String getNombre() {
        return NOMBRE;
    }

    @Override
    public void mostrarIngredientes() {
        System.out.println("Ingredientes de la pizza: Queso mozzarella, queso parmesano, queso cheddar, queso azul");
    }

    @Override
    public void mostrarPreparacion() {
        System.out.println("Preparación de la pizza: Hornear a media temperatura");
    }

    @Override
    public double getPrecio() {
        return PRECIO;
    }
}
