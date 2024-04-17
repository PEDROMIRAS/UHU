/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3asdm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pmira
 */
class Catalogo {
    private final List<CochePrototype> coches;

    public Catalogo() {
        this.coches = new ArrayList<>();
    }

    public void agregarCoche(CochePrototype coche) {
        this.coches.add(coche);
    }

    public void eliminarCoche(CochePrototype coche) {
        this.coches.remove(coche);
    }

    public List<CochePrototype> getCoches() {
        return coches;
    }
}
