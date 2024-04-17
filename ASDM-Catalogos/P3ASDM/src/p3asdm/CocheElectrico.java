/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3asdm;

/**
 *
 * @author pedromiras
 */
public class CocheElectrico extends CocheElectricoAbstracto {
    
    public CocheElectrico(String marca, String modelo, float cilindrada, int potencia) {
        super(marca, modelo,cilindrada, potencia);
    }
    @Override
    public void mostrarCaracteristicas(){
        System.out.println("La marca es : "+marca+" , el modelo es: "+modelo+" ,con una potencia de "+potencia+" C.V. ");
    }   
    
    @Override
    public CochePrototype clonar() {
        CochePrototype prototipo= new CocheElectrico(marca, modelo,cilindrada,potencia);
        prototipo.setMarca(marca);
        prototipo.setModelo(modelo);
        prototipo.setCilindrada(cilindrada);
        prototipo.setPotencia(potencia);
        return prototipo;
    }
}
