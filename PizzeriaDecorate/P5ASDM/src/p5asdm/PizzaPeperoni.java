/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5asdm;

/**
 *
 * @author pmira
 */
public class PizzaPeperoni implements Pizza
{

    @Override
    public void mostrarIngredientes() {
      System.out.println("Ingredientes de la Pizza de Peperoni: Peperoni, queso, salsa de tomate"); 
    }
    
    @Override
    public void mostrarPreparacion() {
        System.out.println("Preparación de la Pizza de Peperoni: Hornear a alta temperatura");
    }
}
