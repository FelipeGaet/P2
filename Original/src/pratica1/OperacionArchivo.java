package pratica1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import pratica1.Miembro;


 
/*public class OperacionArchivo {
      static Date horaactual= new Date();
      static SimpleDateFormat formatohora= new SimpleDateFormat("HH-mm-ss");
      static String hora = formatohora.format(horaactual);
       static Rmiembro nueva = new Rmiembro();
       static Rmotocicleta nueva1 = new Rmotocicleta();
	public static void crearArchivo(ArrayList lista) {
                FileWriter flwriter = null;
		try {
			flwriter = new FileWriter("C:\\Users\\Gruff\\OneDrive\\Documents\\NetBeansProjects\\Pratica1\\"+hora+".txt");
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (Miembro miembro :(ArrayList <Miembro>)lista) {
				bfwriter.write(miembro.getId() + ", " + miembro.getNombre() + "\n");
                                      
			}
                        
			bfwriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}	
/**	public static void aniadirArchivo(ArrayList lista) {
		FileWriter flwriter = null;
		try {
			flwriter = new FileWriter("C:\\Users\\Gruff\\OneDrive\\Documents\\NetBeansProjects\\PRUEBA 3\\"+hora+".txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (Estudiante estudiante :(ArrayList <Estudiante>) lista) {
				bfwriter.write(estudiante.getCedula() + "," + estudiante.getNombres() + "," + estudiante.getApellidos()
						+ "," + estudiante.getTelefono() + "," + estudiante.getDireccion() + "\n");
                                bfwriter.newLine();
			}
			bfwriter.close();
			System.out.println("Archivo modificado satisfactoriamente..");        
		} catch (IOException e) {
			System.out.println("A sucedido un error");
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					System.out.println("A sucedido un error");
				}
			}
		}
	}*/
//}
