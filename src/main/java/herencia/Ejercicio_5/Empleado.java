package herencia.Ejercicio_5;

public abstract class Empleado extends Persona {

    private static int antiguedad;
    protected float salario;
    protected Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, int telefono, float salario) {
        super(nombre, apellidos, DNI, direccion, telefono);
        this.salario = salario;
        this.antiguedad = 0;
        this.supervisor = null;
    }

    public abstract boolean cambiarSupervisor(Empleado supervisor);

    public abstract void incrementarSalario();

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }


    @Override
    public String toString() {
        return super.toString() +
                " Antiguedad: " + antiguedad + "\n" +
                " Salario: " + salario + "€\n" +
                " Supervisor: " + supervisor + "\n"
                ;
    }
}
