package herencia.Ejercicio_4;

public class Coche extends Motor{
    private String matricula;

    public Coche(String tipoMotor, int marchas, String matricula) {
        super(tipoMotor, marchas);
        this.matricula = matricula;
    }
    @Override
    public boolean incrementarVelocidad(int cantidad) {
        if (cantidad<=0) return false;
        if (cantidad>230) return false;

        //Math min elige el numero más pequeño
        //de manera de que si la suma supera el límite,
        //establece el limite como la velocidad
        setVelocidad(Math.min(getVelocidad()+cantidad,230));

        return true;
    }

    @Override
    public boolean decrementarVelocidad(int cantidad) {
        if (cantidad<=0) return false;
        if (cantidad+getVelocidad()<=0) return false;

        setVelocidad(getVelocidad()+cantidad);
        if (getVelocidad()<0)
            setVelocidad(0);

        return true;
    }

    @Override
    public String toString() {
        return super.toString() +
                " matricula: " + matricula + '\n';

    }
}
