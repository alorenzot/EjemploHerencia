package org.example;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[4];

        personas[0]=new Persona("Manolo", "Garcia", "12345678L", 33);
        personas[1]=new Alumno("Juan", "Lopez", "12345678A", 22, "1234", TipoEstudio.ASIR_2);
        personas[2]=new Profesor("Manolo", "Garcia", "12345678P", 44, TipoEstudio.DAM_1);
        personas[3]=new Directivo("Manolo", "Garcia", "12345678D", 44, "Jefe de estudios", TipoEstudio.ASIR_2);

        for (Persona p:personas){
            p.imprimirDNI();
        }

        System.out.println("El cargo de " + personas[3].getNombre() + " es: " + ((Directivo)personas[3]).getCargo());

    }
}
