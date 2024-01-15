package herencia.Ejercicio_4;

public class Vehiculo {
    private int velocidad;

    public Vehiculo (int velocidad){
        this.velocidad=velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public void subirVelocidad(){
        velocidad++;
    }
    public void bajarVelocidad(){
        velocidad--;
    }
}
