/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5asdm;

/**
 *
 * @author pmira
 */
class PizzaBarbacoa implements Pizza {
    @Override
    public void mostrarIngredientes() {
        System.out.println("Ingredientes de la Pizza Barbacoa: Carne picada, cebolla, salsa de tomate , cilantro");
    }

    @Override
    public void mostrarPreparacion() {
        System.out.println("Preparación de la Pizza Cuatro Quesos: Hornear a alta temperatura");
    }
}
