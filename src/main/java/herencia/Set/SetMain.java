package herencia.Set;

import herencia.Ejercicio_1.Persona;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        Set<Persona> personas = new TreeSet<>();
        personas.add(new Persona("Joaquin","Gimenez",30));
        personas.add(new Persona("Manuel","Saez",15));
        personas.add(new Persona("Carmen","Lopez",50));
        personas.add(new Persona("Silvia","Gonzalez",67));

        personas.add(new Persona("Joaquin","Gimenez",30));
        personas.add(new Persona("Manuel","Saez",15));
        personas.add(new Persona("Carmen","Lopez",50));
        personas.add(new Persona("Silvia","Gonzalez",67));

        Iterator<Persona> iterator = personas.iterator();

//        while (iterator.hasNext()){
//            Persona p = iterator.next();
//            if (p.getEdad()%2==0){
//                iterator.remove();
//            }
//        }
//        for (Persona persona:personas)
//            System.out.println(persona);

        Set<Persona> personas2 = new TreeSet<>(Persona.SORT_BY_AGE);
        personas2.addAll(personas);

        List<Persona> personas3 = new LinkedList<>(personas);

        Collections.sort(personas3, Persona.SORT_BY_AGE);

        for (Persona persona:personas3)
            System.out.println(persona);
    }
}
