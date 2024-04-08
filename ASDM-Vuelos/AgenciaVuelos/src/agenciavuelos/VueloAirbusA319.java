/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciavuelos;

/**
 *
 * @author pmira
 */
class VueloAirbusA319 extends Vuelo {
    public VueloAirbusA319(int idVuelo, int plazasDisponibles) {
        super(idVuelo, plazasDisponibles, "Airbus A319");
    }

    @Override
    public void crearVuelo() {
        System.out.println("Creando vuelo Airbus A319");
        
    }

    @Override
    public void devolverBillete() {
        System.out.println("Devolviendo billete del vuelo Airbus A319");
       
    }
}
