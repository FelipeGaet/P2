
package pratica1;


public class cesion {
    
    private String nombre1;
    private String nombre2;
    private String moto;
    private int valor;

    public cesion(String nombre1, String nombre2, String moto, int valor) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.moto = moto;
        this.valor = valor;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
