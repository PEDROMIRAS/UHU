/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;
import java.util.*;
/**
 *
 * @author pmira
 */
public class DescendenteIterator implements Iterator{
    private List<Pizza> pizzas;
    private int posicion=0;
    
    public DescendenteIterator(List<Pizza> pizzas) {
        this.pizzas = pizzas;
        Collections.sort(this.pizzas, Collections.reverseOrder(Comparator.comparingDouble(Pizza::getPrecio)));
    }

    @Override
    public boolean haySiguiente() {
        return posicion < pizzas.size();
    }

    @Override
    public Pizza siguiente() {
        if (!haySiguiente()) {
            throw new NoSuchElementException("No hay más pizzas disponibles.");
        }
        return pizzas.get(posicion++);
    }   
}
