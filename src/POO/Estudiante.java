package POO;

public class Estudiante extends Persona{
    //Esta heredando los atributos de Persona automaticamente
    private  double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
