package herencia.Ejercicio_6;

public class Elipse extends Forma{
    private float radioMenor;
    private float radioMayor;

    public Elipse(char nombre, Punto coordenada, String color, float radioMenor, float radioMayor) {
        super(nombre, coordenada, color);
        this.radioMenor=radioMenor;
        this.radioMayor=radioMayor;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI*(radioMayor*radioMenor));
    }
    @Override
    public float calcularPerimetro() {
        return (float) (2*Math.PI*Math.sqrt((((radioMenor*radioMayor)+ (radioMenor*radioMayor))/2)));
    }

    @Override
    public void cambiarTamaño(float escala) {
        radioMenor*=escala;
        radioMayor*=escala;
    }
    @Override
    public String toString() {
        return super.toString() +
                " Radio menor: " + radioMenor + "\n" +
                " Raido mayor: " + radioMayor + "\n"
                ;
    }
}
