
package pratica1;


public class Miembro {
    private static int count =0;
    private int id;
    private String Nombre;
    private int dinero;

    public Miembro(String Nombre,int dinero) {
        count++;
        id = count;
        this.Nombre = Nombre;
        this.dinero = dinero;
    }
    
    public int getId(){ 
        return id; }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
      
}

