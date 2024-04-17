/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p3asdm;

/**
 *
 * @author pmira
 */
public interface LandRoverInterface {
   
    CocheDieselAbstracto CreaCocheDiesel(String marca, String modelo, float cilindrada, int potencia);
    CocheGasolinaAbstracto CreaCocheGasolina(String marca, String modelo, float cilindrada, int potencia);
}
