package herencia.Ejercicio_6;

public class Punto {
    private char letter;
    private int number;

    public Punto(char letter, int number) {
        this.letter = String.valueOf(letter).toUpperCase().charAt(0);
        this.number = number;
    }


    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "(" + letter + "," + number + ")";
    }
}
