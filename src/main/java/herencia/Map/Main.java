package herencia.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> preciosMap = new HashMap<>();

        preciosMap.put("Naranjas",3);
        preciosMap.put("Platanos",2);
        preciosMap.put("Mango",6);
        preciosMap.put("Kiwi",6);

        System.out.println(preciosMap);
        //preciosMap.remove("Mango");
        System.out.println(preciosMap);

        preciosMap.put("Naranjas",5);
        System.out.println("Precio naranjas: " + preciosMap.get("Naranjas") + "€");

        System.out.println(preciosMap.values());
        System.out.println(preciosMap.keySet());
        //System.out.println(preciosMap.keySet() + "" + preciosMap.values());

        for (String key : preciosMap.keySet())
            System.out.println(preciosMap.get(key));

    }
}
