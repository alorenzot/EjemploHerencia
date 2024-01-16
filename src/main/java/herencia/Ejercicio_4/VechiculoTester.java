package herencia.Ejercicio_4;

public class VechiculoTester {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2];

        vehiculos[0] = new Coche("26F", 6, "4364 SDM");
        vehiculos[1] = new Bicicleta("BMX");

        vehiculos[0].setVelocidad(140);
        vehiculos[0].incrementarVelocidad(20);
        vehiculos[1].setVelocidad(20);
        vehiculos[1].incrementarVelocidad(5);

        for (Vehiculo v: vehiculos){
            System.out.println(v);
        }
    }
}
