/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2asdm;

import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class Practica2ASDM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Avion avion;
        String t;
        System.out.println("Tipo de avion");
        System.out.println("¿Que tipo de avion desea para el vuelo? ");
        t=sc.nextLine();
        System.out.println("\n");
        
        AsignadorAvion miAvion=new AsignadorAvionConcreto(t);
        avion=miAvion.asignarTipo();
        System.out.println("Información del vuelo:");
        System.out.println(avion.datosAvion());
        sc.close();
        
        Agencia agencia = new Agencia(avion, "Agencia de Viajes XYZ");

        // Crear un vuelo con el avión asignado
        Vuelo vuelo = new Vuelo(avion);

        // Crear un usuario para la venta de billetes
        Usuario usuario1 = new Usuario("12345678A", vuelo);

        // Vender algunos billetes
        usuario1.QuieroComprarBilletes(3);

        // Mostrar la información del vuelo
        System.out.println("Plazas disponibles: " + vuelo.cuantosAsientosQuedan());
        System.out.println("Plazas ocupadas: " + vuelo.cuantosAsientosOcupados()+"\n");

        // Devolver algunos billetes
        agencia.QuieroDevolverBilletes(2,usuario1);

        // Mostrar la información actualizada del vuelo
        System.out.println("\nInformación actualizada del vuelo:");
        System.out.println("Tipo de avión: " + avion.datosAvion());
        System.out.println("Plazas disponibles: " + vuelo.cuantosAsientosQuedan());
        System.out.println("Plazas ocupadas: " + vuelo.cuantosAsientosOcupados()+"\n");
    }
}
