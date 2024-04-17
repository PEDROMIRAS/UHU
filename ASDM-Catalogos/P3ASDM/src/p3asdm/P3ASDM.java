/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3asdm;

import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class P3ASDM {
         
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   /*---------ESTE MAIN SI FUNCIONA----------
        
        // Crear instancias de las fábricas
        FabricaLandRover fabricaLandRover = new FabricaLandRover();
        FabricaTesla fabricaTesla = new FabricaTesla();
        FabricaVW fabricaVW = new FabricaVW();

        // Crear coches utilizando las fábricas
        CocheDieselAbstracto landRoverDiesel = fabricaLandRover.CreaCocheDiesel("Land Rover", "Discovery", 3.0f, 250);
        CocheGasolinaAbstracto landRoverGasolina = fabricaLandRover.CreaCocheGasolina("Land Rover", "Evoque", 2.0f, 200);
        
        CocheElectricoAbstracto teslaElectrico = fabricaTesla.CreaCocheElectrico("Tesla", "Model S",0.0f, 450);
        
        CocheElectricoAbstracto vwElectrico = fabricaVW.CreaCocheElectrico("VW", "ID.3",0.0f, 200);
        CocheDieselAbstracto vwDiesel = fabricaVW.CreaCocheDiesel("VW", "Golf", 2.0f, 150);
        CocheGasolinaAbstracto vwGasolina = fabricaVW.CreaCocheGasolina("VW", "Passat", 1.5f, 170);
        CocheHibridoAbstracto vwHibrido = fabricaVW.CreaCocheHibrido("VW", "Touareg", 3.0f, 300);

        // Mostrar características de los coches
        System.out.println("Coches que se han fabricado: ");
        landRoverDiesel.mostrarCaracteristicas();
        landRoverGasolina.mostrarCaracteristicas();
        teslaElectrico.mostrarCaracteristicas();
        vwElectrico.mostrarCaracteristicas();
        vwDiesel.mostrarCaracteristicas();
        vwGasolina.mostrarCaracteristicas();
        vwHibrido.mostrarCaracteristicas();
        
        //// Clonación de algunos coches
        CochePrototype landRoverClon = landRoverDiesel.clonar();
        CochePrototype vwClon = vwGasolina.clonar();
  
        
        // Agregar coches al catálogo
        Catalogo catalogo = new Catalogo();
        catalogo.agregarCoche( landRoverDiesel);
        catalogo.agregarCoche(landRoverGasolina);
        catalogo.agregarCoche(teslaElectrico);
        catalogo.agregarCoche(vwElectrico);
        catalogo.agregarCoche(vwDiesel);
        catalogo.agregarCoche(vwGasolina);
        catalogo.agregarCoche( vwHibrido);
        catalogo.agregarCoche(landRoverClon);
        catalogo.agregarCoche(vwClon);

        
        // Mostrar todos los coches en el catálogo
        System.out.println("\n\nCoches en el catálogo:");
        for (CochePrototype coche : catalogo.getCoches()) {
            coche.mostrarCaracteristicas();
        }
    */
     
   //----------ESTE MAIN TAMBIEN FUNCIONA------------------
   Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa de fabricación de coches.");
        System.out.println("Por favor, introduce la información de los coches que deseas fabricar:");

        // Crear instancias de las fábricas
        FabricaLandRover fabricaLandRover = new FabricaLandRover();
        FabricaTesla fabricaTesla = new FabricaTesla();
        FabricaVW fabricaVW = new FabricaVW();

        // Crear coches utilizando las fábricas
        CocheDieselAbstracto landRoverDiesel = crearCocheDiesel(scanner, fabricaLandRover);
        CocheGasolinaAbstracto landRoverGasolina = crearCocheGasolina(scanner, fabricaLandRover);
        CocheElectricoAbstracto teslaElectrico = crearCocheElectrico(scanner, fabricaTesla);
        CocheElectricoAbstracto vwElectrico = crearCocheElectrico(scanner, fabricaVW);
        CocheDieselAbstracto vwDiesel = crearCocheDiesel(scanner, fabricaVW);
        CocheGasolinaAbstracto vwGasolina = crearCocheGasolina(scanner, fabricaVW);
        CocheHibridoAbstracto vwHibrido = crearCocheHibrido(scanner, fabricaVW);

        // Mostrar características de los coches
        System.out.println("\nCoches que se han fabricado: ");
        landRoverDiesel.mostrarCaracteristicas();
        landRoverGasolina.mostrarCaracteristicas();
        teslaElectrico.mostrarCaracteristicas();
        vwElectrico.mostrarCaracteristicas();
        vwDiesel.mostrarCaracteristicas();
        vwGasolina.mostrarCaracteristicas();
        vwHibrido.mostrarCaracteristicas();
        
        // Clonación de algunos coches
        CochePrototype landRoverClon = landRoverDiesel.clonar();
        CochePrototype vwClon = vwGasolina.clonar();
  
        // Agregar coches al catálogo
        Catalogo catalogo = new Catalogo();
        catalogo.agregarCoche(landRoverDiesel);
        catalogo.agregarCoche(landRoverGasolina);
        catalogo.agregarCoche(teslaElectrico);
        catalogo.agregarCoche(vwElectrico);
        catalogo.agregarCoche(vwDiesel);
        catalogo.agregarCoche(vwGasolina);
        catalogo.agregarCoche(vwHibrido);
        catalogo.agregarCoche(landRoverClon);
        catalogo.agregarCoche(vwClon);

        // Mostrar todos los coches en el catálogo
        System.out.println("\n\nCoches en el catálogo:");
        for (CochePrototype coche : catalogo.getCoches()) {
            coche.mostrarCaracteristicas();
        }
        
        scanner.close();
    }

    // Métodos auxiliares para crear coches
    private static CocheDieselAbstracto crearCocheDiesel(Scanner scanner, FabricaLandRover fabrica) {
        System.out.println("\nCreando coche diesel de Land Rover:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Cilindrada: ");
        float cilindrada = Float.parseFloat(scanner.nextLine());
        System.out.print("Potencia: ");
        int potencia = Integer.parseInt(scanner.nextLine());
        return fabrica.CreaCocheDiesel(marca, modelo, cilindrada, potencia);
    }

    private static CocheGasolinaAbstracto crearCocheGasolina(Scanner scanner, FabricaLandRover fabrica) {
        System.out.println("\nCreando coche gasolina de Land Rover:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Cilindrada: ");
        float cilindrada = Float.parseFloat(scanner.nextLine());
        System.out.print("Potencia: ");
        int potencia = Integer.parseInt(scanner.nextLine());
        return fabrica.CreaCocheGasolina(marca, modelo, cilindrada, potencia);
    }

    private static CocheElectricoAbstracto crearCocheElectrico(Scanner scanner, FabricaTesla fabrica) {
        System.out.println("\nCreando coche eléctrico de Tesla:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Potencia: ");
        int potencia = Integer.parseInt(scanner.nextLine());
        return fabrica.CreaCocheElectrico(marca, modelo, 0.0f, potencia);
    }

    private static CocheElectricoAbstracto crearCocheElectrico(Scanner scanner, FabricaVW fabrica) {
        System.out.println("\nCreando coche eléctrico de VW:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Potencia: ");
        int potencia = Integer.parseInt(scanner.nextLine());
        return fabrica.CreaCocheElectrico(marca, modelo, 0.0f, potencia);
    }

    private static CocheDieselAbstracto crearCocheDiesel(Scanner scanner, FabricaVW fabrica) {
        System.out.println("\nCreando coche diesel de VW:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Cilindrada: ");
        float cilindrada = Float.parseFloat(scanner.nextLine());
        System.out.print("Potencia: ");
        int potencia = Integer.parseInt(scanner.nextLine());
        return fabrica.CreaCocheDiesel(marca, modelo, cilindrada, potencia);
    }

    private static CocheGasolinaAbstracto crearCocheGasolina(Scanner scanner, FabricaVW fabrica) {
        System.out.println("\nCreando coche gasolina de VW:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Cilindrada: ");
        float cilindrada = Float.parseFloat(scanner.nextLine());
        System.out.print("Potencia: ");
        int potencia = Integer.parseInt(scanner.nextLine());
        return fabrica.CreaCocheGasolina(marca, modelo, cilindrada, potencia);
    }

    private static CocheHibridoAbstracto crearCocheHibrido(Scanner scanner, FabricaVW fabrica) {
        System.out.println("\nCreando coche híbrido de VW:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Cilindrada: ");
        float cilindrada = Float.parseFloat(scanner.nextLine());
        System.out.print("Potencia: ");
        int potencia = Integer.parseInt(scanner.nextLine());
        return fabrica.CreaCocheHibrido(marca, modelo, cilindrada, potencia);
    
    }  
    
}
