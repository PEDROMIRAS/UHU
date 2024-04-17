/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2asdm;

/**
 *
 * @author pedromiras
 */
public class AvionA318 extends Avion {
    AvionA318(){super();
}
    int numPlazas=100;

    @Override 
    public int getNumPlazas(){
        return numPlazas;
    }

    @Override
    public String datosAvion(){
        return "El avion es un : Airbus A318 , con : "+getNumPlazas()+" plazas.";
    }
}
