package org.example;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Manolo", "Garcia", "123", 33);
        Persona p2 = new Persona("Manolo", "Garcia", "123", 33);

        System.out.println(p1.equals(p2));

    }
}
