package cadastro;

import java.util.ArrayList;
import java.util.List;

public class SerieService {
    private List<Serie> series = new ArrayList<>();

    public void cadastrarSerie(Serie serie) {
        series.add(serie);
    }

    public List<Serie> listarSeries() {
        return series;
    }
}
