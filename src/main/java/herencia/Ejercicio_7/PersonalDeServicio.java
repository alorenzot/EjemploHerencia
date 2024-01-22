package herencia.Ejercicio_7;

public class PersonalDeServicio extends Empleado{
    private String seccion;

    public PersonalDeServicio(String nombre, String apellidos, int idIdentificacion, EstadoCivil estadoCivil, int añoDeIncorporacion, int numDespacho, String seccion) {
        super(nombre, apellidos, idIdentificacion, estadoCivil, añoDeIncorporacion, numDespacho);
        this.seccion = seccion;
    }
}
