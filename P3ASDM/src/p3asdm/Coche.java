/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3asdm;

/**
 *
 * @author pmira
 */
public abstract class Coche implements CochePrototype{
    protected String marca;
    protected String modelo;
    protected float cilindrada;
    protected int potencia;
    
    
    public Coche(String marca, String modelo, float cilindrada, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }
    
    @Override
    public CochePrototype clonar() {
        try {
            return (CochePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
     @Override
    public void modificarAtributos(float nuevaCilindrada, int nuevaPotencia) {
        this.cilindrada = nuevaCilindrada;
        this.potencia = nuevaPotencia;
    }

    public abstract void mostrarCaracteristicas();
}

