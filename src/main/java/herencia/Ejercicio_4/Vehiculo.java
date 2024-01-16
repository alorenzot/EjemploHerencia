package herencia.Ejercicio_4;

public abstract class Vehiculo {
    private int velocidad;

    public Vehiculo() {
        this.velocidad =0;
    }

    public abstract boolean incrementarVelocidad(int cantidad);
    public abstract boolean decrementarVelocidad(int cantidad);


    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void incrementarVelocidad() {
        velocidad++;
    }

    public void decrementarVelocidad() {
        if (velocidad >= 0){
            velocidad--;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo:" +
                " velocidad: " + velocidad + " km/h"
                ;
    }
}
