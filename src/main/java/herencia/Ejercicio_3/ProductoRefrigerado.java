package herencia.Ejercicio_3;

public class ProductoRefrigerado extends Producto {
    private int codigoOrganismo;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, int codigoOrganismo) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    public int getCodigoOrganismo() {
        return codigoOrganismo;
    }
    @Override
    public String toString() {
        return "Producto{" +
                "fechaCaducidad='" + getFechaCaducidad() + '\'' +
                ", numeroLote=" + getNumeroLote() + '\'' +
                ", codigoOrganismo=" + codigoOrganismo +
                '}';
    }
}
