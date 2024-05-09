/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

/**
 *
 * @author pmira
 */
class PizzaMarinera implements Pizza {
    
    private static final String NOMBRE = "Pizza Marinera";
    private static final double PRECIO = 9.99;
    
    public String getNombre() {
        return NOMBRE;
    }
    @Override
    public void mostrarIngredientes() {
        System.out.println("Ingredientes de la pizza: Salsa de tomate, gambas, mejillones, anchoas");
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
