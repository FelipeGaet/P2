
package pratica1;


public class Miembro implements Comparable<Miembro> {
    private static int count =0;
    private int id;
    private String Nombre;
    private int dinero;
    private int cesion;

    public Miembro(String Nombre,int dinero,int cesion) {
        count++;
        id = count;
        this.Nombre = Nombre;
        this.dinero = dinero;
        this.cesion = cesion;
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

    public int getCesion() {
        return cesion;
    }

    public void setCesion(int cesion) {
        this.cesion = cesion;
    }
    public int compareTo(Miembro m){
        
        return m.cesion - this.cesion;
    }
}
