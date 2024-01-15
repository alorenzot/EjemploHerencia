package herencia.Ejercicio_3abstracta;

import java.time.LocalDate;
import java.time.Month;

public class ProductTest {
    public static void main(String[] args) {

        Product[] products=new Product[3];

        products[0] = new ProductRefrigerado(LocalDate.now(),123456, "Carne Picada",123456);
        products[1] = new ProductCongelado(LocalDate.of(2024, Month.FEBRUARY,28),123456, "Gambas",-2);
        products[2] = new ProductFresco(LocalDate.of(20024, Month.AUGUST, 13),123456, "Carne Picada",LocalDate.now(),"España");

        for (Product p:products){
            p.imprimirInformacion();
        }


    }
}
