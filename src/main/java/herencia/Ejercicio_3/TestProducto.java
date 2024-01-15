package herencia.Ejercicio_3;

public class TestProducto {
    public static void main(String[] args) {
        Producto[] productos = new Producto[4];

        productos[0]=new Producto("15/01/2023", 287946942);
        productos[1]=new ProductoFresco("23/01/2023", 64793255, "03/01/2023", "España");
        productos[2]=new ProductoRefrigerado("25/03/2023", 63524958, 55998874);
        productos[3]=new ProductoCongelado("16/05/2025", 12598712, -5);

        for (Producto producto:productos)
            System.out.println(producto);
    }
}
