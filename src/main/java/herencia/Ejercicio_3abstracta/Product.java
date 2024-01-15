package herencia.Ejercicio_3abstracta;
import java.time.*;

public abstract class Product {
    private LocalDate fechaCaducidad;
    private long lote;
    private String informacion;

    public Product(LocalDate fechaCaducidad, long lote, String informacion) {
        this.fechaCaducidad = fechaCaducidad;
        this.lote = lote;
        this.informacion = informacion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public long getLote() {
        return lote;
    }

    public String getInformacion() {
        return informacion;
    }
    public abstract void imprimirInformacion();

    @Override
    public String toString() {
        return "Product{" +
                "fechaCaducidad=" + fechaCaducidad +
                ", lote=" + lote +
                ", informacion='" + informacion + '\'' +
                '}';
    }
}
