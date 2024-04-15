/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3asdm;

/**
 *
 * @author pedromiras
 */
public  abstract class FabricaVW implements FabricaCoches{
  
    @Override
    public CocheElectricoAbstracto CreaCocheElectrico(String marca, String modelo, float cilindrada , int potencia) {
        return new CocheElectrico(marca, modelo,cilindrada, potencia){};
    }

    @Override
    public CocheDieselAbstracto CreaCocheDiesel(String marca, String modelo, float cilindrada, int potencia) {
        return new CocheDiesel(marca, modelo,cilindrada,potencia) {};
    }

    @Override
    public CocheGasolinaAbstracto CreaCocheGasolina(String marca, String modelo, float cilindrada, int potencia) {
        return new CocheGasolina(marca,modelo,cilindrada,potencia){};
    }

    @Override
    public CocheHibridoAbstracto CreaCocheHibrido(String marca, String modelo, float cilindrada, int potencia) {
       return new CocheHibrido(marca, modelo, cilindrada, potencia){};
    }
    
}
