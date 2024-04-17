/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3asdm;

/**
 *
 * @author pedromiras
 */
public class FabricaTesla implements TeslaInterface{
    
    @Override
    public CocheElectricoAbstracto CreaCocheElectrico(String marca, String modelo, float cilindrada, int potencia) {
        return new CocheElectrico(marca, modelo,cilindrada, potencia){};
    }

}
