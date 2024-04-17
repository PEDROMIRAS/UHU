/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2asdm;

/**
 *
 * @author pedromiras
 */
public class AvionA320 extends Avion {

    public AvionA320() {
        super();
    }
    int numPlazas=200;

    @Override 
    public int getNumPlazas(){
        return numPlazas;
    }

    @Override
    public String datosAvion(){
        return "El avion es un : Airbus A320, con : "+getNumPlazas()+" plazas.";
    }
}
