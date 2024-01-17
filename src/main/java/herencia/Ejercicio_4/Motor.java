package herencia.Ejercicio_4;

public abstract class Motor extends Vehiculo{
    private String tipoMotor;
    private int marchas;

    public Motor(String tipoMotor, int marchas) {
        this.tipoMotor = tipoMotor;
        this.marchas = marchas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public int getMarchas() {
        return marchas;
    }

    @Override
    public boolean incrementarVelocidad(int cantidad) {
        if (cantidad<=0) return false;
        setVelocidad(getVelocidad()+cantidad);
        return true;
    }

    @Override
    public boolean decrementarVelocidad(int cantidad) {
        if (getVelocidad()<=0) return false;
        if ((getVelocidad()-cantidad)<=0) return false;
        else {
            setVelocidad(getVelocidad() - cantidad);
            return true;
        }
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" +
                " motor: " + tipoMotor + "\n" +
                " marchas: " + marchas + "\n"
                ;
    }
}
