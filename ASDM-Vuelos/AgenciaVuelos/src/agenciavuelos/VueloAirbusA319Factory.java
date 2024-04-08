/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciavuelos;

/**
 *
 * @author pmira
 */
class VueloAirbusA319Factory implements VueloFactory {
    private static int id = 0;

    @Override
    public Vuelo crearVuelo() {
        return new VueloAirbusA319(++id, 200); // Se asigna una capacidad de 200 plazas por defecto
    }
}
