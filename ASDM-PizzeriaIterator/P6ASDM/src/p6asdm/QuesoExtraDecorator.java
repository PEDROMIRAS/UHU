/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

/**
 *
 * @author pmira
 */
class QuesoExtraDecorator extends PizzaDecorator {
    public QuesoExtraDecorator(Pizza pizzaDecorada) {
        super(pizzaDecorada);
    }
    
    @Override
    public String getNombre() {
        return "Queso extra " + super.getNombre();
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
    
    @Override
    public double getPrecio() {
        System.out.println("El coste del queso extra es de: ");
        return pizzaDecorada.getPrecio() + 0.75;
    }
}
