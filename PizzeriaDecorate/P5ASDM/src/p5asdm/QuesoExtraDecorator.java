/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5asdm;

/**
 *
 * @author pmira
 */
class QuesoExtraDecorator extends PizzaDecorator {
    public QuesoExtraDecorator(Pizza pizzaDecorada) {
        super(pizzaDecorada);
    }

    @Override
    public void mostrarIngredientes() {
        super.mostrarIngredientes();
        System.out.println(" + Queso extra");
    }

    @Override
    public void mostrarPreparacion() {
        super.mostrarPreparacion();
        System.out.println(" + Agregar capa adicional de queso antes de hornear");
    }
}
