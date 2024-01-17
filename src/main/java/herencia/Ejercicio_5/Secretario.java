package herencia.Ejercicio_5;


public class Secretario extends Empleado {
    private String despacho;
    private int fax;


    public Secretario(String nombre, String apellidos, String DNI, String direccion, int telefono, float salario, String despacho, int fax) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    @Override
    public boolean cambiarSupervisor(Empleado supervisor) {
        if (supervisor instanceof  JefeDeZona || supervisor instanceof Secretario) {
            this.supervisor = supervisor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void incrementarSalario() {
        salario*=(getAntiguedad() * 0.15f) + 1f;
    }
}
