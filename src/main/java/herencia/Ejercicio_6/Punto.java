package herencia.Ejercicio_6;

public class Punto {
    private char letter;
    private int number;

    public Punto(char letter, int number) {
        this.letter = String.valueOf(letter).toUpperCase().charAt(0);
        this.number = number;
    }

    public static Punto getPuntoAleatorio(){
        char[] letters={'a','b','c','d','e','f','g','h','i','j'};
        int random = (char)(Math.random()*10);

        return new Punto(letters[random],random);
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
