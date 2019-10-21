
package pratica1;


public class Motocicleta {
    private int Id;
    private String Marca;
    private String Matricula;
    private int coste;

    public Motocicleta(int Id,String Marca, String Matricula, int coste) {
        this.Id = Id;
        this.Marca = Marca;
        this.Matricula = Matricula;
        this.coste = coste;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
    
}
