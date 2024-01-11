package herencia.Ejercicio_2;

public class Disco extends Multimedia {
    private Genero genero;

    public Disco(String titulo, String autor, Formato formato, float duracion, Genero genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Disco:" + '\n' +
                " titulo: " + getTitulo() + '\n' +
                " autor: " + getAutor() + '\n' +
                " formato: " + getFormato() + '\n' +
                " duración: " + getDuracion() + '\n' +
                " genero: " + genero + '\n'
                ;
    }
}
