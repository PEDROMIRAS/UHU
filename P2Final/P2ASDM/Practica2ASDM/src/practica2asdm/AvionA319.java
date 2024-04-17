/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2asdm;

/**
 *
 * @author pedromiras
 */
public class AvionA319 extends Avion {

    public AvionA319() {
        super();
    }
    int numPlazas=150;

    @Override 
    public int getNumPlazas(){
        return numPlazas;
    }

    @Override
    public String datosAvion(){
        return "El avion es un : Airbus A319, con : "+getNumPlazas()+" plazas.";
    }
}
