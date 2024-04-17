/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2asdm;

/**
 *
 * @author pedromiras
 */
public class AsignadorAvionConcreto extends AsignadorAvion {
    String tipo;
    public AsignadorAvionConcreto(String t){
        tipo=t;
    }
    @Override
    public Avion asignarTipo(){
        
       switch(tipo){ 
           case "A318" -> {
               return new AvionA318();
            }
           case "A319" -> {
               return new AvionA319();
            }
           case "A320" -> {
               return new AvionA320();
            }
           case "A321" -> {
               return new AvionA321();
            }
           default -> System.out.println("Tipo de avion no encontrado");
         }
        return null;
    
   }
}
