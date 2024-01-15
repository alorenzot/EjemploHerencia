package herencia.Ejercicio_3_noAbstracta;

public class Producto {
    private String fechaCaducidad;
    private int numeroLote;

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                ", numeroLote=" + numeroLote +
                '}';
    }
}
