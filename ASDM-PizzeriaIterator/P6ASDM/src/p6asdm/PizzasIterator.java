/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author pmira
 */
public class PizzasIterator implements Iterator{
    private List<Pizza> pizzas;
    private int posicion=0;
    
    public PizzasIterator(List<Pizza> pizzas){
        this.pizzas=pizzas;
    }

    @Override
    public boolean haySiguiente() {
    return posicion < pizzas.size();
    }

    @Override
    public Pizza siguiente() {
        if (!haySiguiente()) {
            throw new NoSuchElementException("No hay mas pizzas disponibles.");
        }
        return pizzas.get(posicion++);
    }  
}
