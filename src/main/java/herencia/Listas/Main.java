package herencia.Listas;

import herencia.Ejercicio_1.Persona;

public class Main {
    public static void main(String[] args) {
        Lista<Persona> lista = new Lista<>();
        lista.addHead(new Persona("Carmen","Jiménez","25146548E",56));
        lista.addHead(new Persona("Miguel","López  ","25146548E",56));
        lista.addHead(new Persona("Carlos","Duarte ","25146548E",56));
        lista.addHead(new Persona("Manuel","Sánchez","25146548E",56));
        lista.addHead(new Persona("Joel","Gutiérrez","25146548E",56));
        System.out.println(lista);

//        System.out.println(lista.removeHead());
//        System.out.println(lista.removeTail());
//        System.out.println(lista.remove(2));
        System.out.println(lista.contains(new Persona("Miguel","López","25146548E",56)));
//        System.out.println(lista);

    }
}
