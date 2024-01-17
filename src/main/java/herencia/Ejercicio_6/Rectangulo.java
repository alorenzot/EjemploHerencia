package herencia.Ejercicio_6;

public class Rectangulo extends Forma{
    private float ladoMenor;
    private float ladoMayor;

    public Rectangulo(char nombre, Punto coordenada, String color, float ladoMenor, float ladoMayor) {
        super(nombre, coordenada, color);
        this.ladoMenor=ladoMenor;
        this.ladoMayor=ladoMayor;
    }

    @Override
    public float calcularArea(){
        return ladoMenor*ladoMayor;
    }
    @Override
    public float calcularPerimetro(){
        return (2*ladoMenor) + (2*ladoMayor);
    }
    @Override
    public void cambiarTamaño(float escala){
        ladoMenor*=escala;
        ladoMayor*=escala;
    }
    @Override
    public String toString() {
        return super.toString() +
                " Lado menor: " + ladoMenor + "\n" +
                " Lado mayor: " + ladoMayor + "\n"
                ;
    }
}
