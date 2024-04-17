/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2asdm;

/**
 *
 * @author pedromiras
 */
public class Agencia {

    private final Vuelo vuelo;
    private final String nombre;

    public Agencia(Avion avion, String nombre) {
        avion.datosAvion();
        this.vuelo=new Vuelo(avion);
        this.nombre = nombre;
    }

    public void QuieroDevolverBilletes(int billetes, Usuario usuario){
        vuelo.devuelveBilletes(billetes, usuario);
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
