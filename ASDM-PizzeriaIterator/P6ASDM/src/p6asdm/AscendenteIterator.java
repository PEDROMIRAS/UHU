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
public class AscendenteIterator implements Iterator {
    private List<Pizza> pizzas;
    private int position = 0;

    public AscendenteIterator(List<Pizza> pizzas) {
        this.pizzas = pizzas;
        Collections.sort(this.pizzas, Comparator.comparingDouble(Pizza::getPrecio));
    }

    @Override
    public boolean haySiguiente() {
        return position < pizzas.size();
    }

    @Override
    public Pizza siguiente() {
        if (!haySiguiente()) {
            throw new NoSuchElementException("No hay más pizzas disponibles.");
        }
        return pizzas.get(position++);
    }
}

 