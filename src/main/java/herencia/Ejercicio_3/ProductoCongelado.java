package herencia.Ejercicio_3;

public class ProductoCongelado extends Producto{
    private int temperaturaCongelacion;

    public ProductoCongelado(String fechaCaducidad, int numeroLote, int temperaturaCongelacion) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public int getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }
    @Override
    public String toString() {
        return "Producto{" +
                "fechaCaducidad='" + getFechaCaducidad() + '\'' +
                ", numeroLote=" + getNumeroLote() + '\'' +
                ", temperaturaCongelacion=" + temperaturaCongelacion + "ºC" +
                '}';
    }
}
