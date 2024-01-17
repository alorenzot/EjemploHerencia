package herencia.Ejercicio_5;

public class Cliente extends Persona {
    private int codigoCliente;

    public Cliente(String nombre, String apellidos, String DNI, String direccion, int telefono, int codigoCliente) {
        super(nombre, apellidos, DNI, direccion, telefono);
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Cliente)) return false;

        Cliente c = (Cliente) obj;
        return codigoCliente == c.codigoCliente;
    }
}
