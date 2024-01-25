package herencia.List;

import herencia.Ejercicio_1.Persona;

import java.util.*;

public class ListMain {
    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<>();
        //List<Persona> lista2;
        lista.add(new Persona("Juan","Garcia"));
        lista.add(new Persona("Luis","Soria"));
        lista.add(new Persona("Maria","Garcia"));
        lista.add(new Persona("Miguel","Garcia"));
        lista.add(new Persona("Joel","Sanchez"));
        //lista2 = new ArrayList<>(lista);

        lista.sort(Comparator.comparing(Persona::getApellidos));

        Iterator<Persona> iterator = lista.iterator();
        while (iterator.hasNext()){
            Persona p = iterator.next();
            if (p.getApellidos().startsWith("S"))
                iterator.remove();
            else System.out.println(p);
        }



    }

}
