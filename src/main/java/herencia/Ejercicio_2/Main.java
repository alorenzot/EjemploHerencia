package herencia.Ejercicio_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Multimedia[] coleccion = new Multimedia[3];

        coleccion[0] = new Disco("<copingmechanism>", "WILLOW", Formato.MP3, 3.10f, Genero.POP_PUNK);
        coleccion[1] = new Pelicula("Super Mario Bros.", "ILLUMINATION", Formato.MOV, 92f);
        coleccion[2] = new Pelicula("La vida de Joel", "Dame 90 centimos", Formato.DVD, 100f, "Joel", null);

        for (Multimedia col:coleccion){
            System.out.println(col);
        }
    }
}
