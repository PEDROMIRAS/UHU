/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciavuelos;

/**
 *
 * @author pmira
 */
class VueloAirbusA321 extends Vuelo {
    public VueloAirbusA321(int idVuelo, int plazasDisponibles) {
        super(idVuelo, plazasDisponibles, "Airbus A321");
    }

    @Override
    public void crearVuelo() {
        System.out.println("Creando vuelo Airbus A321");
        // Lógica para la creación del vuelo Airbus A321
    }

    @Override
    public void devolverBillete() {
        System.out.println("Devolviendo billete del vuelo Airbus A321");
        // Lógica para devolver un billete del vuelo Airbus A321
    }
}
