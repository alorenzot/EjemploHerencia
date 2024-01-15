package herencia.Ejercicio_2;

public class Multimedia {
    private String titulo;
    private String autor;
    private Formato formato;
    private float duracion;

    public Multimedia(String titulo, String autor, Formato formato, float duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public float getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Multimedia{" + '\n' +
                " titulo=" + titulo + '\n' +
                " autor=" + autor + '\n' +
                " formato=" + formato +
                " duración=" + duracion + '\n'
                ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Multimedia)) return false;
        Multimedia m = (Multimedia) obj;
        return m.titulo.equals(titulo) &&
                m.autor.equals(autor);
    }


}

