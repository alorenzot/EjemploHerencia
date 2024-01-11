package herencia.Ejercicio_1;

import java.util.Arrays;

public class Directivo extends Profesor {
    private String cargo;
    private TipoEstudio[] gradosImpartidos;

    public Directivo(String nombre, String apellidos, String DNI, int edad, String cargo, TipoEstudio... gradosImpartidos) {
        super(nombre, apellidos, DNI, edad);
        this.cargo = cargo;
        this.gradosImpartidos = gradosImpartidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void imprimirDNI() {
        System.out.println("Directivo: " + getDNI());
    }

    @Override
    public String toString() {
        return "Directivo{ " +
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", DNI='" + getDNI() + '\'' +
                ", edad=" + getEdad() +
                ", cargo= " + cargo + "\n" +
                ", Grados impartidos= " + Arrays.toString(gradosImpartidos) + "\n" +
                '}';
    }
}
