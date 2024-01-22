package herencia.Ejercicio_7;

public class Estudiantes extends Persona{
    private String curso;

    public Estudiantes(String nombre, String apellidos, int idIdentificacion, EstadoCivil estadoCivil, String curso) {
        super(nombre, apellidos, idIdentificacion, estadoCivil);
        this.curso = curso;
    }
}
