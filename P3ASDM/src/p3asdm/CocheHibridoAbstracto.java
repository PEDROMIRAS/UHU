/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3asdm;

/**
 *
 * @author pedromiras
 */
public abstract class CocheHibridoAbstracto {
    protected String marca;
    protected String modelo;
    protected float cilindrada;
    protected int potencia;
    
    
    public CocheHibridoAbstracto(String marca, String modelo, float cilindrada, int potencia){
        this.marca=marca;
        this.modelo=modelo;
        this.cilindrada=cilindrada;
        this.potencia=potencia;
        
    }
    
    public void mostrarCaracteristicas(){}
}
