package pratica1;

import java.util.ArrayList;



public class Rmotocicleta {
    
    ArrayList<Motocicleta> Motocicletas;
    
    public Rmotocicleta(){
        Motocicletas = new ArrayList<>();
        }
    public void AgregarMotocicleta(int Id, String Marca, String Matricula, int coste, int imp){
        Motocicleta nuevo = new Motocicleta(Id,Marca,Matricula,coste,imp);
        Motocicletas.add(nuevo);
        //OperacionArchivo.crearArchivo(Motocicletas);
}
    public void VisualizarMotocicleta(){
        for(int i = 0; i<Motocicletas.size(); i++){
            System.out.println("------------------------");
            System.out.println("ID: "+Motocicletas.get(i).getId());
            System.out.println("Marca: "+Motocicletas.get(i).getMarca());
            System.out.println("Matricula: "+Motocicletas.get(i).getMatricula());
            System.out.println("Coste: "+Motocicletas.get(i).getCoste());
            System.out.println("Importe: "+Motocicletas.get(i).getImp());
        }                    
}
}

