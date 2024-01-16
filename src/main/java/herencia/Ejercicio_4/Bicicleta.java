package herencia.Ejercicio_4;

public class Bicicleta extends Vehiculo{
    public String tipo;

    public Bicicleta(String tipo) {
        this.tipo=tipo;
    }

    @Override
    public boolean incrementarVelocidad(int cantidad) {
        if (cantidad<=0) return false;
        if (cantidad>4  && cantidad+getVelocidad()>40) return false;
        else setVelocidad(getVelocidad()+cantidad);
        return true;
    }

    @Override
    public boolean decrementarVelocidad(int cantidad) {
        if (cantidad<=0) return false;
        if (cantidad>=5) return false;
        if (cantidad+getVelocidad()<=0) return false;
        else
            setVelocidad(getVelocidad()+cantidad);
        return true;
    }

    @Override
    public String toString() {
        return "Bicicleta: \n" +
                " tipo: " + tipo + '\n' +
                " velocidad: " + getVelocidad() + " km/h\n";
    }
}
