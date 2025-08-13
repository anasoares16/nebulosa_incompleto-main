package cadastro;

public class Serie {
    private String titulo;
    private int temporadas;

    public Serie(String titulo, int temporadas) {
        this.titulo = titulo;
        this.temporadas = temporadas;
    }

    public String getTitulo() { return titulo; }
    public int getTemporadas() { return temporadas; }

    @Override
    public String toString() {
        return "Série: " + titulo + " - " + temporadas + " temporadas";
    }
}
