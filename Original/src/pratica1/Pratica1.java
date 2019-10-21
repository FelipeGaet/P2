
package pratica1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gruff
 */
public class Pratica1 {

   
    public static void main(String[] args) {
        
       Scanner sn = new Scanner(System.in);
       boolean salir = false; boolean salir2;boolean salir3;
       int opcion;int resp1 = 0;int opcion2;int resp;int resp2;int resp3;int resp4 = 0; int resp5 = 0;
       String nom = "";int resp6 = 0;int resp7 = 0;int resp8 = 0;
       int cas1 = 3;int cas2 = 2;int cas3 = 2;int cas4 = 2;int cas5 = 2;
       int cou = -1;int imp = 0;
       
       Rmiembro nueva = new Rmiembro();
       Rmotocicleta nueva1 = new Rmotocicleta();
       Rcesion nueva2 = new Rcesion();
       int ban;
       
       do{
       try {
           ban = 0;
       System.out.println("--------------------------------------------------------");
       System.out.print("Ingrese importe maximo: "); resp1 = sn.nextInt();
       }catch(Exception e){
           
           System.out.println("¡Ingrese los datos correctamente, por favor!"); ban = 1; sn.nextLine();}
       }while(ban != 0);
       
       while(!salir){
           
           System.out.println("--------------------------------------------------------");
           System.out.println("MENÚ");
           System.out.println("1. Registrar un nuevo miembro\n"
           + "2. Registrar una nueva motocicleta\n"
           + "3. Registrar una cesión\n"
           + "4. Listar en pantalla los miembros con motos en posesión\n"
           + "5. Listar todas las motos\n"
           + "6. Mostrar las cesiones realizadas\n"
           + "7. Incrementar otros gastos a una moto\n"
           + "8. Eliminar a un miembro\n"
           + "9. Salir del programa\n"); 
           
            
           try {
                System.out.println("--------------------------------------------------------");
                System.out.print("Ingrese una de las opciones: "); opcion = sn.nextInt();
          
            switch(opcion){
               case 1:
                   
                   System.out.println("--------------------------------------------------------");
                   System.out.println("REGISTRE UN MIEMBRO");
                   System.out.print("Ingrese nombre del nuevo miembro: "); nom = sn.next();
                   nueva.AgregarMiembro(nom,0);
                   break;
                   
               case 2:
                   salir2 = false;
                   while(!salir2){
                   System.out.println("--------------------------------------------------------");
                   System.out.println("REGISTRE UNA MOTOCICLETA");
                   System.out.println("1. Vespa Primavera, de 125 CC, (2500€)\n"
                   + "2. Motobenae Poney AG2, de 70 CC, (2300€) \n"
                   + "3. Bultaco de 200 CC, (3800€)\n"
                   + "4. Guzzi Cardelino 73, de 75 CC, (1200€)\n"
                   + "5. Ducati mini de 49 CC, (4000€)\n"
                   + "6. Volver");
                   try {
 
                System.out.print("Ingrese una de las opciones: "); opcion2 = sn.nextInt();
                
            switch(opcion2){
                case 1:
                    int sec;
                    int secc;
                    cas1 = cas1 - 1;
                    if ((cas1 == 2)){
                    
                    do{
                try {
                     ban = 0;
                     System.out.println("--------------------------------------------------------");
                     System.out.print("Ingrese el importe: "); imp = sn.nextInt();
                     
                }catch(Exception e){
           
                     System.out.println("¡Ingrese los datos correctamente, por favor!"); ban = 1; sn.nextLine();}
                }while(ban != 0);
                    nueva1.AgregarMotocicleta(0,"Vespa Primavera, de 125 CC","8276JSH",2500,imp);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    sec = nueva.Miembros.get(resp-1).getDinero();
                    nueva.Miembros.get(resp-1).setDinero(sec+2500);
                    secc = nueva.Miembros.get(resp-1).getDinero();
                    if (secc <= resp1){
                        nueva1.Motocicletas.get(cou+1).setId(resp);
                        nueva1.Motocicletas.get(cou+1).setMarca("Vespa Primavera, de 125 CC");
                        nueva1.Motocicletas.get(cou+1).setMatricula("8276JSH");
                        nueva1.Motocicletas.get(cou+1).setCoste(2500);
                        cou = cou + 1;
                    break; 
                    }else{
                        nueva.Miembros.get(resp-1).setDinero(secc-2500);
                        System.out.println("El miembro supera el importe maximo.");
                        cas1 = cas1 + 1;
                        break;
                    }
                    }else if (cas1 == 1){
                        do{
                try {
                     ban = 0;
                     System.out.println("--------------------------------------------------------");
                     System.out.print("Ingrese el importe: "); imp = sn.nextInt();
                     
                }catch(Exception e){
           
                     System.out.println("¡Ingrese los datos correctamente, por favor!"); ban = 1; sn.nextLine();}
                }while(ban != 0);
                    nueva1.AgregarMotocicleta(0,"Vespa Primavera, de 125 CC","8736JSG",2300,imp);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    sec = nueva.Miembros.get(resp-1).getDinero();
                    nueva.Miembros.get(resp-1).setDinero(sec+2500);
                    secc = nueva.Miembros.get(resp-1).getDinero();
                    if (secc <= resp1){
                    nueva1.Motocicletas.get(cou+1).setId(resp);
                    nueva1.Motocicletas.get(cou+1).setMarca("Vespa Primavera, de 125 CC");
                    nueva1.Motocicletas.get(cou+1).setMatricula("8736JSG");
                    nueva1.Motocicletas.get(cou+1).setCoste(2500);
                    cou = cou + 1;
                    break;
                    }else{
                        nueva.Miembros.get(resp-1).setDinero(secc-2500);
                        System.out.println("El miembro supera el importe maximo.");
                        cas1 = cas1 + 1;
                        break;
                    }
                    } else{
                        System.out.println("No quedan más motocicletas, por favor eliga otra.");
                        break;
                    }
                    
                case 2:
                    int sec2;
                    int sec22;
                    cas2 = cas2 - 1;
                    if (cas2 == 1){
                        do{
                try {
                     ban = 0;
                     System.out.println("--------------------------------------------------------");
                     System.out.print("Ingrese el importe: "); imp = sn.nextInt();
                     
                }catch(Exception e){
           
                     System.out.println("¡Ingrese los datos correctamente, por favor!"); ban = 1; sn.nextLine();}
                }while(ban != 0);
                    nueva1.AgregarMotocicleta(0,"Motobenae Poney AG2, de 70 CC","6374STW",2300,imp);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    sec2 = nueva.Miembros.get(resp-1).getDinero();
                    nueva.Miembros.get(resp-1).setDinero(sec2+2300);
                    sec22 = nueva.Miembros.get(resp-1).getDinero();
                    if (sec22 <= resp1){
                    nueva1.Motocicletas.get(cou+1).setId(resp);
                    nueva1.Motocicletas.get(cou+1).setMarca("Motobenae Poney AG2, de 70 CC");
                    nueva1.Motocicletas.get(cou+1).setMatricula("6374STW");
                    nueva1.Motocicletas.get(cou+1).setCoste(2300);
                    cou = cou + 1;
                    break;
                    }else{
                        nueva.Miembros.get(resp-1).setDinero(sec22-2300);
                        System.out.println("El miembro supera el importe maximo.");
                        cas2 = cas2 + 1;
                        break;
                    }
                    }else{
                        System.out.println("No quedan más motocicletas, por favor eliga otra.");
                        break;
                    }
                case 3:
                    int sec3;
                    int sec33;
                    cas3 = cas3 - 1;
                    if (cas3 == 1){
                        do{
                try {
                     ban = 0;
                     System.out.println("--------------------------------------------------------");
                     System.out.print("Ingrese el importe: "); imp = sn.nextInt();
                     
                }catch(Exception e){
           
                     System.out.println("¡Ingrese los datos correctamente, por favor!"); ban = 1; sn.nextLine();}
                }while(ban != 0);
                    nueva1.AgregarMotocicleta(0,"Bultaco de 200 CC","6273ATF",3800,imp);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    sec3 = nueva.Miembros.get(resp-1).getDinero();
                    nueva.Miembros.get(resp-1).setDinero(sec3+3800);
                    sec33 = nueva.Miembros.get(resp-1).getDinero();
                    if (sec33 <= resp1){
                    nueva1.Motocicletas.get(cou+1).setId(resp);
                    nueva1.Motocicletas.get(cou+1).setMarca("Bultaco de 200 CC");
                    nueva1.Motocicletas.get(cou+1).setMatricula("6273ATF");
                    nueva1.Motocicletas.get(cou+1).setCoste(3800);
                    cou = cou + 1;
                    break;
                    }else{
                        nueva.Miembros.get(resp-1).setDinero(sec33-3800);
                        System.out.println("El miembro supera el importe maximo.");
                        cas3 = cas3 + 1;
                        break;
                    }
                    }else{
                        System.out.println("No quedan más motocicletas, por favor eliga otra.");
                        break;
                    }
                case 4:
                    int sec4;
                    int sec44;
                    cas4 = cas4 - 1;
                    if (cas4 == 1){
                        do{
                try {
                     ban = 0;
                     System.out.println("--------------------------------------------------------");
                     System.out.print("Ingrese el importe: "); imp = sn.nextInt();
                     
                }catch(Exception e){
           
                     System.out.println("¡Ingrese los datos correctamente, por favor!"); ban = 1; sn.nextLine();}
                }while(ban != 0);
                    nueva1.AgregarMotocicleta(0,"Guzzi Cardelino 73, de 75 CC","8736QYH",1200,imp);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    sec4 = nueva.Miembros.get(resp-1).getDinero();
                    nueva.Miembros.get(resp-1).setDinero(sec4+1200);
                    sec44 = nueva.Miembros.get(resp-1).getDinero();
                    if (sec44 <= resp1){
                    nueva1.Motocicletas.get(cou+1).setId(resp);
                    nueva1.Motocicletas.get(cou+1).setMarca("Guzzi Cardelino 73, de 75 CC");
                    nueva1.Motocicletas.get(cou+1).setMatricula("8736QYH");
                    nueva1.Motocicletas.get(cou+1).setCoste(1200);
                    cou = cou + 1;
                    break;
                    }else{
                        nueva.Miembros.get(resp-1).setDinero(sec44-1200);
                        System.out.println("El miembro supera el importe maximo.");
                        cas4 = cas4 + 1;
                        break;
                    }
                    }else{
                        System.out.println("No quedan más motocicletas, por favor eliga otra.");
                        break;
                    }
                case 5:
                    int sec5;
                    int sec55;
                    cas5 = cas5 - 1;
                    if (cas5 == 1){
                        do{
                try {
                     ban = 0;
                     System.out.println("--------------------------------------------------------");
                     System.out.print("Ingrese el importe: "); imp = sn.nextInt();
                     
                }catch(Exception e){
           
                     System.out.println("¡Ingrese los datos correctamente, por favor!"); ban = 1; sn.nextLine();}
                }while(ban != 0);
                    nueva1.AgregarMotocicleta(0,"Ducati mini de 49 CC","9813TCS",4000,imp);
                    System.out.println("--------------------------------------------------------");
                    System.out.println("ASIGNE UN ID A LA MOTOCICLETA SELECCIONADA");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese un ID: "); resp = sn.nextInt();
                    sec5 = nueva.Miembros.get(resp-1).getDinero();
                    nueva.Miembros.get(resp-1).setDinero(sec5+4000);
                    sec55 = nueva.Miembros.get(resp-1).getDinero();
                    if (sec55 <= resp1){
                    nueva1.Motocicletas.get(cou+1).setId(resp);
                    nueva1.Motocicletas.get(cou+1).setMarca("Ducati mini de 49 CC");
                    nueva1.Motocicletas.get(cou+1).setMatricula("9813TCS");
                    nueva1.Motocicletas.get(cou+1).setCoste(4000);
                    cou = cou + 1;
                    break;
                    }else{
                        nueva.Miembros.get(resp-1).setDinero(sec55-4000);
                        System.out.println("El miembro supera el importe maximo.");
                        cas5 = cas5 + 1;
                        break;
                    }
                    }else{
                        System.out.println("No quedan más motocicletas, por favor eliga otra.");
                        break;
                    }
                case 6:
                    salir2=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 6");
            }
                   }catch (InputMismatchException e) {
                System.out.println("Debes ingresar una de las opciones");
                sn.next();
            }
                   }
                   break;
                case 3:
                   int sec6;
                   int sec66 ;
                   int cost ;
                   int din;
                   String nom1;
                   String nom2;
                   String moto;
                   int mi5 = nueva1.Motocicletas.size();
                   int mi6 = nueva.Miembros.size();
                   System.out.println("SELECCIONE EL MIEMBRO QUE DARA LA MOTOCICLETA:");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    System.out.print("Ingrese el ID del miembro: "); resp = sn.nextInt();
                    System.out.println("------------------------");
                    System.out.println("SELECCIONE UNA MOTOCICLETA DEL MIEMBRO:");
                    for(int i=0;i< mi5 ;i++) {
                       int re2 = nueva1.Motocicletas.get(i).getId();       
                       if (resp == re2){
                          
                          System.out.println("------------------------");
                          System.out.println(i+")"+" "+"Motocicleta: "+nueva1.Motocicletas.get(i).getMarca()+" "+"(Coste: "+nueva1.Motocicletas.get(i).getCoste()+"€)");
                          
                       }
                   }
                   System.out.println("------------------------");
                   System.out.print("Ingrese el número de la motocicleta: "); resp2 = sn.nextInt();
                   System.out.println("SELECCIONE EL MIEMBRO QUE RECIBIRA LA MOTOCICLETA:");
                   for(int i = 0; i<mi6; i++){
                   int re3 = nueva.Miembros.get(i).getId();
                   if (resp != re3){
                   System.out.println("------------------------");
                   System.out.println("ID: "+nueva.Miembros.get(i).getId());
                   System.out.println("Nombre: "+nueva.Miembros.get(i).getNombre());
                   System.out.println("Dinero: "+nueva.Miembros.get(i).getDinero());
                   }
        }
                   System.out.println("------------------------");
                   System.out.print("Ingrese el ID del miembro: "); resp3 = sn.nextInt();
                   
                   sec6 = nueva.Miembros.get(resp3-1).getDinero();
                   cost = nueva1.Motocicletas.get(resp2).getCoste();
                   nueva.Miembros.get(resp3-1).setDinero(sec6+cost);
                   sec66 = nueva.Miembros.get(resp3-1).getDinero();
                   nom1 = nueva.Miembros.get(resp-1).getNombre();
                   nom2 = nueva.Miembros.get(resp3-1).getNombre();
                   moto = nueva1.Motocicletas.get(resp2).getMarca();
                   din = nueva.Miembros.get(resp-1).getDinero();
                   
                   if (sec66 <= resp1){
                   nueva.Miembros.get(resp-1).setDinero(din-cost);
                   nueva1.Motocicletas.get(resp2).setId(resp3);
                   nueva2.AgregarCesion(nom1, nom2, moto, cost);
                   }else{
                        nueva.Miembros.get(resp3-1).setDinero(sec66-cost);
                        System.out.println("El miembro no puede tener esta motocicleta porque supera el importe maximo");
                        break;
                    }
                   
                   break;
                   
                case 4:
                   int mi2 = nueva1.Motocicletas.size();
                   int mi3 = nueva.Miembros.size();
                   System.out.println("MIEMBROS CON MOTOS EN POSESIÓN"); 
                   for(int x=0;x< mi3 ;x++) {
                      int re = nueva.Miembros.get(x).getId();
                      
                          System.out.println("------------------------");
                          System.out.println("ID: "+nueva.Miembros.get(x).getId());
                          System.out.println("Nombre: "+nueva.Miembros.get(x).getNombre());
                          
                    for(int i=0;i< mi2 ;i++) {
                       int re2 = nueva1.Motocicletas.get(i).getId();       
                       if (re == re2){
                          
                          System.out.println("Motocicleta: "+nueva1.Motocicletas.get(i).getMarca()); 
                       }
                   }
                   }
                   break;
                case 5:
                    int mi = nueva1.Motocicletas.size();
                    int mi4 = nueva.Miembros.size();
                    System.out.println("LISTA DE TODAS LAS MOTOS");
                   for(int x=0;x< mi ;x++) {
                        
                        int re2 = nueva1.Motocicletas.get(x).getId();
                        
                          System.out.println("------------------------");
                          System.out.println("ID: "+nueva1.Motocicletas.get(x).getId());
                          System.out.println("Motocicleta: "+nueva1.Motocicletas.get(x).getMarca());
                          System.out.println("Matrícula: "+nueva1.Motocicletas.get(x).getMatricula());
                          System.out.println("Coste: "+nueva1.Motocicletas.get(x).getCoste());
                          System.out.println("Importe: "+nueva1.Motocicletas.get(x).getImp());
                          
                          for(int i=0;i< mi4 ;i++) {
                        int re = nueva.Miembros.get(i).getId(); 
                       if (re == re2){
                          
                          System.out.println("Miembro en su poder: "+nueva.Miembros.get(i).getNombre()); 
                       }
                   }
                      }
                   break;
                case 6:
                   nueva2.VisualizarCesion();
                   break;
                case 7:
                int mi7 = nueva1.Motocicletas.size();;
                int im;
                          System.out.println("--------------------------------------------------------");
                          System.out.println("SELECCIONE UNA MOTOCICLETA PARA INCREMENTAR IMPORTE:");
                    for(int i=0;i< mi7 ;i++) {
                              
                          System.out.println("------------------------");
                          System.out.println(i+")");
                          System.out.println("Motocicleta: "+nueva1.Motocicletas.get(i).getMarca()+" "+"(Coste: "+nueva1.Motocicletas.get(i).getCoste()+"€)"+" "+"(Importe: "+nueva1.Motocicletas.get(i).getImp()+"€)" );
                          }
                    
                          do{
                    try {
                     ban = 0;
                          System.out.println("------------------------");
                          System.out.print("Ingrese el número de la motocicleta: "); resp4 = sn.nextInt();
                     
                    }catch(Exception e){
           
                          System.out.println("¡Ingrese los datos correctamente, por favor!"); ban = 1; sn.nextLine();}
                    }while(ban != 0);
                          
                          do{
                          try {
                     ban = 0;
                          System.out.println("------------------------");
                          System.out.print("Ingrese importe a sumar: "); resp5 = sn.nextInt();
                     
                    }catch(Exception e){
           
                          System.out.println("¡Ingrese los datos correctamente, por favor!"); ban = 1; sn.nextLine();}
                    }while(ban != 0);
                          im = nueva1.Motocicletas.get(resp4).getImp();
                          nueva1.Motocicletas.get(resp4).setImp(im + resp5);
                break;
                case 8:
                    int sec77 = 0 ;
                    int cost1 = 0 ;
                    salir3 = false;
                    int mi8 = nueva.Miembros.size();
                    int mi9 = nueva1.Motocicletas.size();
                    int nu = 0;
                    System.out.println("--------------------------------------------------------");
                    System.out.println("SELECCIONE UN MIEMBRO A ELIMINAR:");
                    nueva.VisualizarMiembro();
                    System.out.println("------------------------");
                    
                    do{
                          try {
                     ban = 0;
                          System.out.print("Ingrese un ID : "); resp6 = sn.nextInt();
                     
                    }catch(Exception e){
           
                          System.out.println("¡Ingrese los datos correctamente, por favor!"); ban = 1; sn.nextLine();}
                    }while(ban != 0);
                    
                    while(!salir3){
                    for(int i=0;i< mi9 ;i++) {
                       int re2 = nueva1.Motocicletas.get(i).getId();       
                       if (resp6 == re2){
                          
                          System.out.println("------------------------");
                          System.out.println("SELECCIONE LA MOTOCICLETA:");
                          System.out.println(i+")"+" "+"Motocicleta: "+nueva1.Motocicletas.get(i).getMarca()+" "+"(Coste: "+nueva1.Motocicletas.get(i).getCoste()+"€)");
                          
                   System.out.println("------------------------");
                   System.out.print("Ingrese el número de la motocicleta: "); resp7 = sn.nextInt();
                   System.out.println("SELECCIONE EL MIEMBRO QUE RECIBIRA LA MOTOCICLETA:");
                   for(int x = 0; x<mi8; x++){
                   int re3 = nueva.Miembros.get(x).getId();
                   if (resp6 != re3){
                   System.out.println("------------------------");
                   System.out.println("ID: "+nueva.Miembros.get(x).getId());
                   System.out.println("Nombre: "+nueva.Miembros.get(x).getNombre());
                   System.out.println("Dinero: "+nueva.Miembros.get(x).getDinero());
                   }
                }
                   System.out.println("------------------------");
                   System.out.print("Ingrese el ID del miembro: "); resp8 = sn.nextInt();
                   
                    sec6 = nueva.Miembros.get(resp8-1).getDinero();
                    cost1 = nueva1.Motocicletas.get(resp7).getCoste();
                    nueva.Miembros.get(resp8-1).setDinero(sec6+cost1);
                    sec77 = nueva.Miembros.get(resp8-1).getDinero();
                    
                    if (sec77 <= resp1){
                    nueva1.Motocicletas.get(resp7).setId(resp8);
                   }else{
                        nueva.Miembros.get(resp8-1).setDinero(sec77-cost1);
                        System.out.println("El miembro no puede tener esta motocicleta porque supera el importe maximo");
                    } 
                    
                    }else{
                           System.out.println("¡Los cambios fueron realizados y se elimino el miembro correctamente!");
                           salir3 = true;
                       }
                    }
                   }
                   nueva.Miembros.remove(resp6-1);
                    break;
                case 9:
                   
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 7");
                   
            } 
           }catch (InputMismatchException e) {
               System.out.println("--------------------------------------------------------");
                System.out.println("Debes ingresar una de las opciones");
                sn.next();
            }
            
       }
    }

    
}
