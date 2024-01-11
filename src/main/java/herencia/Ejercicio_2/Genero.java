package herencia.Ejercicio_2;

public enum Genero {

    ROCK("Rock"),
    POP("Pop"),
    POP_ROCK("Pop Rock"),
    POP_PUNK("Pop Punk"),
    ELECTRONICA("Electrónica"),
    ELECTROPOP("Electropop"),
    ELECTROROCK("ElectroRock"),
    PUNK("Punk"),
    ROCK_DURO("Rock duro"),
    DANCE("Dance"),
    DANCEPOP("DancePop"),
    OPERA("Ópera"),
    RANDB("R&B"),
    BLUES("Blues"),
    TECHNO("Techno"),
    HOUSE("House"),
    LO_FI("Lo-Fi"),
    ;


    private String genero;

    Genero(String genero) {
        this.genero = genero;
    }
}
