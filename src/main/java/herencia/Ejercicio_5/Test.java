package herencia.Ejercicio_5;

public class Test {
    public static void main(String[] args) {
        Secretario s = new Secretario("n", "a", "5", "asd23", 456123789, 1000f, "A1", 456);
        System.out.println(s);
        s.setAntiguedad(1);

        System.out.println(s);
        s.setAntiguedad(2);
        s.incrementarSalario();
        System.out.println(s);
    }
}
