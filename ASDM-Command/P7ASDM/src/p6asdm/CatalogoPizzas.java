/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6asdm;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pmira
 */

class CatalogoPizzas {
    private List<Pizza> pizzas;

    public CatalogoPizzas() {
        this.pizzas = new ArrayList<>();
        inicializarCatalogo();
    }

    private void inicializarCatalogo() {
        pizzas.add(new PizzaPeperoni());
        pizzas.add(new PizzaCuatroQuesos());
        pizzas.add(new PizzaBarbacoa());
        pizzas.add(new PizzaMarinera());
    }
    
    public List<Pizza> obtenerPizzas() {
        return new ArrayList<>(pizzas); 
    }

}
