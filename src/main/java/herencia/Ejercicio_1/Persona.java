package herencia.Ejercicio_1;

import java.util.Comparator;

public class Persona implements Comparable<Persona> {
    public static Comparator<Persona> SORT_BY_AGE = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return p1.edad-p2.edad;
        }
    };
    private String nombre;
    private String apellidos;
    private String DNI;
    private int edad;

    public Persona(String nombre, String apellidos, String DNI, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.edad = edad;
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void cumplirAnyos() {
        edad++;
    }

    public void imprimirDNI() {
        System.out.println("Persona: " + DNI);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Persona)) return false;
        Persona p = (Persona) obj;
        return p.DNI == DNI &&
                p.nombre.equals(nombre) &&
                p.apellidos.equals(apellidos) &&
                p.edad==edad;
    }
    @Override
    public int hashCode(){
        return nombre.hashCode();
    }


    @Override
    public String toString() {
        return "\nPersona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                //", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                "}";
    }

    @Override
    public int compareTo(Persona o){
        if (o.apellidos.equals(apellidos)) {
            return nombre.compareTo(o.nombre);
        }

        return apellidos.compareTo(o.apellidos);
    }

}
