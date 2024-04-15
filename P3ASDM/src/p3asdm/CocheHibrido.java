/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3asdm;

/**
 *
 * @author pedromiras
 */
public abstract class CocheHibrido extends CocheHibridoAbstracto {
    
    public CocheHibrido(String marca, String modelo, float cilindrada, int potencia) {
        super(marca, modelo, cilindrada, potencia);
    }
    @Override
    public void mostrarCaracteristicas(){
        System.out.println("La marca es : "+marca+" , el modelo es: "+modelo+" , la cilindrada del motor es: "+cilindrada+" ,con una potencia de "+potencia+" C.V. ");
    }
}
