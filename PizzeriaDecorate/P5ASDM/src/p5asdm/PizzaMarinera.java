/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5asdm;

/**
 *
 * @author pmira
 */
class PizzaMarinera implements Pizza {
    @Override
    public void mostrarIngredientes() {
        System.out.println("Ingredientes de la Pizza Cuatro Quesos: Salsa de tomate, gambas, mejillones, anchoas");
    }

    @Override
    public void mostrarPreparacion() {
        System.out.println("Preparación de la Pizza Cuatro Quesos: Hornear a media temperatura");
    }
}
