package herencia.Ejercicio_6;

public class Cuadrado extends Rectangulo {

    public Cuadrado(char nombre, Punto coordenada, String color, float ladoMenor, float ladoMayor) {
        super(nombre, coordenada, color, ladoMenor, ladoMayor);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Lado: " + getLadoMenor() + "cm\n"
                ;
    }


}
