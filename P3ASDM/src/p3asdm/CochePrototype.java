/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p3asdm;

/**
 *
 * @author pmira
 */
interface CochePrototype extends Cloneable {
    CochePrototype clonar();
    void modificarAtributos(float nuevaCilindrada, int nuevaPotencia);
    void mostrarCaracteristicas();
}
