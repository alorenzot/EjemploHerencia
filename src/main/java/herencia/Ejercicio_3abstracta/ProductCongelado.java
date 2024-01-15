package herencia.Ejercicio_3abstracta;

import java.time.LocalDate;

public class ProductCongelado extends Product{

    private int temperaturaCongelacion;

    public ProductCongelado(LocalDate fechaCaducidad, long lote, String informacion, int temperaturaCongelacion) {
        super(fechaCaducidad, lote, informacion);
        this.temperaturaCongelacion=temperaturaCongelacion;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(
                "El producto " + getInformacion() + " con numero de lote " + getLote() +
                        " se trata de un producto congelado que caduca en fecha " + getFechaCaducidad() +
                        " y cuya temperatura recomendada para su congelación es de " + temperaturaCongelacion + "ºC."
        );
    }
}
