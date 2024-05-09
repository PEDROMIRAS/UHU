/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;

/**
 *
 * @author pmira
 */
class PeperoniDecorator extends PizzaDecorator {
    public PeperoniDecorator(Pizza pizzaDecorada) {
        super(pizzaDecorada);
    }
    
    @Override
    public String getNombre() {
        return "Peperoni " + super.getNombre();
    }

    @Override
    public void mostrarIngredientes() {
        super.mostrarIngredientes();
        System.out.println(" + Peperoni");
    }

    @Override
    public void mostrarPreparacion() {
        super.mostrarPreparacion();
        System.out.println(" + Agregar rodajas de peperoni antes de hornear");
    }

    @Override
    public double getPrecio() {
        System.out.println("El coste del peperoni extra es de: ");
        return pizzaDecorada.getPrecio() + 1.00;
    }
    
}
