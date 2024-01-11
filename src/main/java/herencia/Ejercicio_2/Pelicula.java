package herencia.Ejercicio_2;

public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;
    private static String animacion = "Animación";

    public Pelicula(String titulo, String autor, Formato formato, float duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public Pelicula(String titulo, String autor, Formato formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = animacion;
        this.actrizPrincipal = animacion;
    }

    @Override
    public String toString() {
        return "Pelicula:" + '\n' +
                " titulo: " + getTitulo() + '\n' +
                " autor: " + getAutor() + '\n' +
                " formato: " + getFormato() + '\n' +
                " duración: " + getDuracion() + '\n' +
                " actorPrincipal: " + actorPrincipal + '\n' +
                " actrizPrincipal: " + actrizPrincipal + '\n'
                ;

    }
}
