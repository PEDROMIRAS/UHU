/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p3asdm;

/**
 *
 * @author pmira
 */
interface CochePrototype {
    public String getMarca();
    public void setMarca(String marca);
    public String getModelo();
    public void setModelo(String modelo);
    public float getCilindrada();
    public void setCilindrada(float cc);
    public int getPotencia();
    public void setPotencia(int hp);
    
    public CochePrototype clonar();
    public void mostrarCaracteristicas();
}
