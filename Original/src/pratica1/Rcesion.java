
package pratica1;

import java.util.ArrayList;


public class Rcesion {
    
    ArrayList<cesion> Cesion;
    
    public Rcesion(){
        Cesion = new ArrayList<>();
        }
    
    public void AgregarCesion(String nombre1, String nombre2, String moto, int valor){
        cesion nuevo = new cesion(nombre1,nombre2,moto,valor);
        Cesion.add(nuevo);
}
    public void VisualizarCesion(){
        for(int i = 0; i<Cesion.size(); i++){
            System.out.println("-----------------------------------");
            System.out.println("- CESIÓN N°"+(i+1));
            System.out.println("Miembro que cedió la motocicleta: "+Cesion.get(i).getNombre1());
            System.out.println("Motocicleta: "+Cesion.get(i).getMoto());
            System.out.println("Coste: "+Cesion.get(i).getValor());
            System.out.println("Miembro que recibió la motocicleta: "+Cesion.get(i).getNombre2());
        }
    }
}
