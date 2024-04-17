/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2asdm;

/**
 *
 * @author pedromiras
 */
import java.util.Arrays;

public class Vuelo {
    private final Avion avion;
    private final Usuario[] pasajeros;

    public Vuelo(Avion avion) {
        this.avion = avion;
        this.pasajeros = new Usuario[avion.getNumPlazas()];
    }
    public Avion getAvion(){
        return avion;
    }
    public void vendeBilletes(int billetes, Usuario usuario){
        int libres = cuantosAsientosQuedan();
        if (billetes > libres) {
            System.out.println("No se pueden vender " + billetes + " billete/s, solo quedan " + libres + " libre/s.");
        }

        int i = 0;
        while (billetes > 0) {
            if (pasajeros[i] == null) {
                pasajeros[i] = usuario;
                billetes--;
            }
            i++;
        }
    }

    public int getBilletes() {
        return avion.getNumPlazas() - cuantosAsientosOcupados();
    }

    public void devuelveBilletes(int billetes, Usuario usuario) {
        int reservados = (int) Arrays.asList(pasajeros).stream().filter(pasajero -> pasajero == usuario).count();
        if (billetes > reservados) {
            
            System.out.println("No se pueden devolver "+billetes+" billete/s, el usuario solo tine reservados "+reservados+" billete/s.");
        }

        int i = pasajeros.length-1;
        while (billetes > 0) {
            if (pasajeros[i] == usuario) {
                pasajeros[i] = null;
                billetes--;
            }
            i--;
        }
    }
    
    int cuantosAsientosQuedan() {
        return (int) Arrays.asList(pasajeros).stream().filter(pasajero -> pasajero == null).count();
    }

    int cuantosAsientosOcupados() {
        return avion.getNumPlazas() - cuantosAsientosQuedan();
    }

    public Usuario[] obtenerReservas() {
        return pasajeros;
    }

}
