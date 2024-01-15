package herencia.Ejercicio_3abstracta;

import java.time.LocalDate;

public class ProductFresco extends Product{

    private LocalDate fechaEnvasado;
    private String paisOrigen;

    public ProductFresco(LocalDate fechaCaducidad, long lote, String informacion, LocalDate fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, lote, informacion);
        this.fechaEnvasado=fechaEnvasado;
        this.paisOrigen=paisOrigen;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println(
                "El producto "+ getInformacion() + " con numero de lote " + getLote() +
                        " se trata de un producto fresco que caduca en fecha " + getFechaCaducidad() +
                        " cuya fecha de envasado es " + fechaEnvasado +
                        " y su país de origen es " + paisOrigen + "."
        );
    }
}
