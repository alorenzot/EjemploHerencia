package herencia.Ejercicio_3abstracta;

import java.time.LocalDate;

public class ProductRefrigerado extends Product{

    private int codigoSupervision;

    public ProductRefrigerado(LocalDate fechaCaducidad, long lote, String informacion, int codigoSupervision) {
        super(fechaCaducidad, lote, informacion);
        this.codigoSupervision=codigoSupervision;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(
                "El producto " + getInformacion() + " con numero de lote " + getLote() +
                        " se trata de un producto fresco que caduca en fecha " + getFechaCaducidad() +
                        " y cuyo código de supervision es " +codigoSupervision + "."
        );
    }
}
