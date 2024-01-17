package herencia.Ejercicio_6;

public class Test {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo('r', new Punto('a',3),"Rojo",1.5f,2f );
        System.out.println(r);
        System.out.println(r.calcularArea());
        System.out.println(r.calcularPerimetro());
        r.cambiarTamaño(2);
        System.out.println(r);
    }
}
