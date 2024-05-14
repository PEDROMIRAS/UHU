/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

/**
 *
 * @author pmira
 */
class PizzaBarbacoa implements Pizza {
    
    private static final String NOMBRE = "Pizza Barbacoa";
    private static final double PRECIO = 12.99;
    
    public String getNombre() {
        return NOMBRE;
    }
    
    @Override
    public void mostrarIngredientes() {
        System.out.println("Ingredientes de la pizza: Carne picada, cebolla, salsa de tomate , cilantro");
    }

    @Override
    public void mostrarPreparacion() {
        System.out.println("Preparación de la pizza: Hornear a alta temperatura");
    }

    @Override
    public double getPrecio() {
       return PRECIO;
    }
}
