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
        if (cantidad+getVelocidad()>=200) return false;
        else setVelocidad(getVelocidad()+cantidad);
        return true;
    }

    @Override
    public boolean decrementarVelocidad(int cantidad) {
        if (cantidad<=0) return false;
        if (cantidad+getVelocidad()<=0) return false;
        else setVelocidad(getVelocidad()+cantidad);
        return true;
    }

    @Override
    public String toString() {
        return "Coche: \n" +
                " motor: " + getTipoMotor() + '\n' +
                " marchas: " + getMarchas() + '\n' +
                " matricula: " + matricula + '\n' +
                " velocidad: " + getVelocidad()+ " km/h\n";
    }
}
