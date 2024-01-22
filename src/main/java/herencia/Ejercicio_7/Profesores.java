package herencia.Ejercicio_7;

public class Profesores extends Empleado{
    private String departamento;

    public Profesores(String nombre, String apellidos, int idIdentificacion, EstadoCivil estadoCivil, int añoDeIncorporacion, int numDespacho, String departamento) {
        super(nombre, apellidos, idIdentificacion, estadoCivil, añoDeIncorporacion, numDespacho);
        this.departamento = departamento;
    }
}
