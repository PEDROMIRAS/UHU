/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

/**
 *
 * @author pmira
 */
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaDecorada;
    
     @Override
    public String getNombre() {
        return pizzaDecorada.getNombre();
    }

    public PizzaDecorator(Pizza pizzaDecorada) {
        this.pizzaDecorada = pizzaDecorada;
    }

    @Override
    public void mostrarIngredientes() {
        pizzaDecorada.mostrarIngredientes();
    }

    @Override
    public void mostrarPreparacion() {
        pizzaDecorada.mostrarPreparacion();
    }
}
