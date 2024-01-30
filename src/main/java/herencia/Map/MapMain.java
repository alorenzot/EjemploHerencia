package herencia.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
    public static void main(String[] args) {
        Map<Coche,Persona> coches = new TreeMap<>();

        coches.put(new Coche("1234 BBB"), new Persona("Juan", "Garcia"));
        coches.put(new Coche("5678 CCC"), new Persona("Juan", "Garcia"));
        coches.put(new Coche("9101 DDD"), new Persona("Luis", "Romero"));

        System.out.print(coches);

        System.out.println(coches.containsKey(new Coche("1234 BBB")));
    }
}
