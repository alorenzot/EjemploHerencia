package herencia.Ejercicio_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Multimedia[] coleccion = new Multimedia[6];

        coleccion[0] = new Disco("<COPINGMECHANISM>", "WILLOW", Formato.MP3, 3.10f, Genero.POP_PUNK);
        coleccion[1] = new Disco("Diamonds And Dancefloors", "Ava Max", Formato.MP3, 3.43f, Genero.POP);
        coleccion[2] = new Disco("Tissues", "YUNGBLUD", Formato.MP3, 3.23f, Genero.POP_ROCK);
        coleccion[3] = new Pelicula("Super Mario Bros.", "ILLUMINATION", Formato.MOV, 92f);
        coleccion[4] = new Pelicula("La vida de Joel", "Dame 90 céntimos", Formato.DVD, 100f, "Joel", null);
        coleccion[5] = new Pelicula("Tomates", "Cebollas", Formato.AVI, 100f, "si", "no");

        for (Multimedia col : coleccion) {
            System.out.println(col);
        }
    }
}
