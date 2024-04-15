/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3asdm;

/**
 *
 * @author pedromiras
 */
public class P3ASDM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancias de las implementaciones concretas de las fábricas
        FabricaLandRover fabricaLandRover = new FabricaLandRover();
        FabricaTesla fabricaTesla = new FabricaTesla();
        FabricaVW fabricaVW = new FabricaVW();
        
        // Crear algunos coches utilizando las fábricas
        CocheElectricoAbstracto cocheTesla = fabricaTesla.CreaCocheElectrico("Tesla", "Model S", 0, 450);
        CocheDieselAbstracto cocheLandRover = fabricaLandRover.CreaCocheDiesel("Land Rover", "Discovery", 3.0f, 250);
        CocheGasolinaAbstracto cocheVW = fabricaVW.CreaCocheGasolina("VW", "Golf", 1.6f, 150);
        CocheHibridoAbstracto cocheHibridoVW = fabricaVW.CreaCocheHibrido("VW", "Passat", 2.0f, 200);
        
        // Mostrar características de los coches
        cocheTesla.mostrarCaracteristicas();
        cocheLandRover.mostrarCaracteristicas();
        cocheVW.mostrarCaracteristicas();
        cocheHibridoVW.mostrarCaracteristicas();
        
        // Clonar un coche y modificar sus atributos
        CochePrototype cocheClonado = (CochePrototype) cocheTesla.clonar();
        cocheClonado.modificarAtributos(500, 480);
        cocheClonado.mostrarCaracteristicas();
        
        // Agregar coches al catálogo
        Catalogo catalogo = new Catalogo();
        catalogo.agregarCoche((CochePrototype) cocheTesla);
        catalogo.agregarCoche((CochePrototype) cocheLandRover);
        catalogo.agregarCoche((CochePrototype) cocheVW);
        catalogo.agregarCoche((CochePrototype) cocheHibridoVW);
        
        // Mostrar todos los coches en el catálogo
        System.out.println("Coches en el catálogo:");
        for (CochePrototype coche : catalogo.getCoches()) {
            coche.mostrarCaracteristicas();
        }
    }
    
}
