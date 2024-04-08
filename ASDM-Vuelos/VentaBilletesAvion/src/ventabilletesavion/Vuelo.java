/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventabilletesavion;
/**
 *
 * @author pmira
 */
public class Vuelo {
    private String tipoAvion;
    private int plazasTotales;
    private int plazasDisponibles;

    public Vuelo(String tipoAvion, int plazasDisponibles) {
        this.tipoAvion = tipoAvion;
        this.plazasDisponibles = plazasDisponibles;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public int getPlazasDisponibles() {
        return plazasDisponibles;
    }
    
    public void actualizarPlazasDisponibles(int cantidad) {
        plazasDisponibles += cantidad;
        if (plazasDisponibles < 0) {
            plazasDisponibles = 0; // Evitar que las plazas disponibles sean negativas
        } else if (plazasDisponibles > plazasTotales) {
            plazasDisponibles = plazasTotales; // Evitar que las plazas disponibles excedan las totales
        }
    }

    public void reservarPlazas(int cantidad) {
        this.plazasDisponibles -= cantidad;
    }

    public void liberarPlazas(int cantidad) {
        this.plazasDisponibles += cantidad;
    }
}





