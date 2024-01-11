package herencia.Ejercicio_1;

import java.util.Arrays;

public class Profesor extends Persona {
    private TipoEstudio[] gradosImpartidos;

    public Profesor(String nombre, String apellidos, String DNI, int edad, TipoEstudio... gradosImpartidos) {
        super(nombre, apellidos, DNI, edad);
        this.gradosImpartidos = gradosImpartidos;
    }

    public TipoEstudio[] getGradosImpartidos() {
        return gradosImpartidos;
    }

    public void setGradosImpartidos(TipoEstudio[] gradosImpartidos) {
        this.gradosImpartidos = gradosImpartidos;
    }

    @Override
    public void imprimirDNI() {
        System.out.println("Profesor: " + getDNI());
    }

    @Override
    public String toString() {
        return "Profesor{ " +
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", DNI='" + getDNI() + '\'' +
                ", edad=" + getEdad() + "\n" +
                ", Grados impartidos= " + Arrays.toString(gradosImpartidos) + "\n" +
                '}';
    }
}
