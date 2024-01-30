package herencia.Map;

import herencia.Ejercicio_4.Motor;

public class Coche implements Comparable<Coche>{
    private String matricula;

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        return matricula.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (!(obj instanceof Coche)) return false;
        Coche c = (Coche)(obj);
        return c.matricula.equals(matricula);
    }

    @Override
    public String toString() {
        return
                " matricula: " + matricula;

    }

    @Override
    public int compareTo(Coche o) {
        return matricula.compareTo(o.matricula);
    }
}
