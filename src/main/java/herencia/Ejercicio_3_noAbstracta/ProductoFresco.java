package herencia.Ejercicio_3_noAbstracta;

public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;


    public ProductoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" +
                "fechaCaducidad='" + getFechaCaducidad() + '\'' +
                ", numeroLote=" + getNumeroLote() + '\'' +
                ", fechaEnvasado=" + fechaEnvasado + '\'' +
                ", paisOrigen=" + paisOrigen +
                '}';
    }
}
