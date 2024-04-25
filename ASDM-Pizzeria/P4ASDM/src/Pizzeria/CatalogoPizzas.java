/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzeria;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pmira
 */

class CatalogoPizzas {
    private List<String> pizzas;

    public CatalogoPizzas() {
        this.pizzas = new ArrayList<>();
        inicializarCatalogo();
    }

    private void inicializarCatalogo() {
        pizzas.add("Peperoni");
        pizzas.add("Cuatro Quesos");
        pizzas.add("Barbacoa");
        pizzas.add("Marinera");
    }

    public void mostrarCatalogo() {
        for (String pizza : pizzas) {
            System.out.println(pizza);
        }
    }
}

