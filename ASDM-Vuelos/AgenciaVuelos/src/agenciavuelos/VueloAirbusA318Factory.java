/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciavuelos;

/**
 *
 * @author pmira
 */
class VueloAirbusA318Factory implements VueloFactory {
    private static int id = 0;

    @Override
    public Vuelo crearVuelo() {
        return new VueloAirbusA318(++id, 150); // Se asigna una capacidad de 150 plazas por defecto
    }
}
