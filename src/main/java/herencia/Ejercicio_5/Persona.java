package herencia.Ejercicio_5;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private int telefono;

    public Persona(String nombre, String apellidos, String DNI, String direccion, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Persona)) return false;

        Persona p = (Persona) obj;
        return DNI == p.DNI;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                " Apellidos: " + apellidos + "\n" +
                " DNI: " + DNI + "\n" +
                " Dirección: " + direccion + "\n" +
                " Teléfono: " + telefono + "\n"
                ;
    }
}
