package herencia.Ejercicio_2;

public enum Formato {
    WAW("waw"),
    MP3("mp3"),
    MIDI("midi"),
    AVI("avi"),
    MOV("mov"),
    MPG("mpg"),
    CDAUDIO("cdAudio"),
    DVD("dvd");

    private String formato;

    Formato(String formato) {
        this.formato = formato;
    }
}
