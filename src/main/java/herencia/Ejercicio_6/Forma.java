package herencia.Ejercicio_6;

public abstract class Forma {
    private char nombre;
    private Punto coordenada;
    private String color;

    public Forma(char nombre, Punto coordenada, String color) {
        this.nombre = nombre;
        this.coordenada = coordenada;
        this.color = color;
    }

    public abstract float calcularArea();

    public abstract float calcularPerimetro();

    public abstract void cambiarTamaño(float escala);

    public void moverForma(Punto punto) {
        coordenada = punto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre + "\n" +
                " Coordenada: " + coordenada + "\n" +
                " Color: " + color + "\n"
                ;
    }
}
