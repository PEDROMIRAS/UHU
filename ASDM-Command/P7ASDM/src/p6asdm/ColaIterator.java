/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

import java.util.NoSuchElementException;
import java.util.Queue;

/**
 *
 * @author pmira
 */
public class ColaIterator implements Iterator{
     private Queue<Pizza> cola;
     
     public ColaIterator(Queue<Pizza> cola){
         this.cola=cola;
     }
     
    @Override
    public boolean haySiguiente() {
     return !cola.isEmpty();
    }

    @Override
    public Pizza siguiente() {
           if (!haySiguiente()) {
            throw new NoSuchElementException("No hay más pizzas disponibles.");
        }
        return cola.poll();  
    }
    
}
