/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3asdm;

/**
 *
 * @author pedromiras
 */
public abstract class CocheHibridoAbstracto implements CochePrototype{
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
    
    @Override
    public void mostrarCaracteristicas(){}
    
    @Override
    public String getMarca(){
        return marca;
    }
    
    @Override
    public void setMarca(String marc){ 
        marca=marc;
    }
    @Override
    public String getModelo(){
        return modelo;
    }
    
    @Override
    public void setModelo(String mod){ 
       modelo=mod;
    }
    
    @Override
    public float getCilindrada(){
        return cilindrada;
    }
    
    @Override
    public void setCilindrada(float cc){ 
       cilindrada=cc;
    }
    @Override
    public int getPotencia(){
        return potencia;
    }
    
    @Override
    public void setPotencia(int hp){ 
       potencia=hp;
    }
    
}
