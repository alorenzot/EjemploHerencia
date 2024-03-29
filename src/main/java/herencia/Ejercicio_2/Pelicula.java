package herencia.Ejercicio_2;

public class Pelicula extends Multimedia {
    private String actorPrincipal;
    private String actrizPrincipal;
    private static final String ANIMACION = "Animación";

    public Pelicula(String titulo, String autor, Formato formato, float duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        if (actorPrincipal == null && actrizPrincipal == null) {
            this.actorPrincipal = ANIMACION;
            this.actrizPrincipal = ANIMACION;
        } else {
            this.actorPrincipal = actorPrincipal;
            this.actrizPrincipal = actrizPrincipal;
        }
    }

    public Pelicula(String titulo, String autor, Formato formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = ANIMACION;
        this.actrizPrincipal = ANIMACION;
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
