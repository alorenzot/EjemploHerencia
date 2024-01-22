package herencia.Ejercicio_7;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private int idIdentificacion;
    private EstadoCivil estadoCivil;

    public Persona(String nombre, String apellidos, int idIdentificacion, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idIdentificacion = idIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void cambiarEstadoCivil(EstadoCivil estadoCivil){
        setEstadoCivil(estadoCivil);
    }
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public enum EstadoCivil {
        SOLTERO("Soltero"),
        CASADO("Casado"),
        DIVORCIADO("Divorciado");
        private String estado;

        EstadoCivil(String estado) {
            this.estado = estado;
        }
    }
}
