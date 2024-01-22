package herencia.Ejercicio_7;

public class Empleado extends Persona{
    private int añoDeIncorporacion;
    private int numDespacho;

    public Empleado(String nombre, String apellidos, int idIdentificacion, EstadoCivil estadoCivil, int añoDeIncorporacion, int numDespacho) {
        super(nombre, apellidos, idIdentificacion, estadoCivil);
        this.añoDeIncorporacion = añoDeIncorporacion;
        this.numDespacho = numDespacho;
    }
}
