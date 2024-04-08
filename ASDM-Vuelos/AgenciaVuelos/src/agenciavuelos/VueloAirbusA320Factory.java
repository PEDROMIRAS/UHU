/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciavuelos;

/**
 *
 * @author pmira
 */
class VueloAirbusA320Factory implements VueloFactory {
    private static int id = 0;

    @Override
    public Vuelo crearVuelo() {
        return new VueloAirbusA320(++id, 250); // Se asigna una capacidad de 250 plazas por defecto
    }
}
