/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2asdm;


/**
 *
 * @author pedromiras
 */
public class Usuario {
    private final Avion avion;
    private final Vuelo vuelo;
    private final String dni;
    
    public Usuario(String dni, Vuelo vuelo) {
        this.avion = new Avion(); // Create an instance of Avion
        this.dni = dni;
        this.vuelo = vuelo;
        
    }
    public Avion getAvion() {
        return avion;
    }
    public void QuieroComprarBilletes(int billetes){
        vuelo.vendeBilletes(billetes, this);
    }
    
    @Override
    public String toString(){
        return dni;
    }
}
