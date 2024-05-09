/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 *
 * @author pmira
 */
public class PilaIterator implements Iterator{
    private Stack<Pizza> pila;
    
    public PilaIterator(Stack<Pizza> pila){
        this.pila=pila;
    }

    @Override
    public boolean haySiguiente() {
      return !pila.isEmpty();
    }

    @Override
    public Pizza siguiente() {
        if (!haySiguiente()) {
            throw new NoSuchElementException("No hay mas pizzas disponibles");
        }
        return pila.pop();
    }
    
}
