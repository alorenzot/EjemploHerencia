package herencia.Ejercicio_6;

public class Circulo extends Elipse {
    public Circulo(char nombre, Punto coordenada, String color, float radioMenor, float radioMayor) {
        super(nombre, coordenada, color, radioMenor, radioMayor);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Radio: " + getRadioMenor() + "cm\n"
                ;
    }
}
