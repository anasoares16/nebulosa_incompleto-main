package cadastro;

import java.util.ArrayList;
import java.util.List;

public class FilmeService {
    private List<Filme> filmes = new ArrayList<>();

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
    }

    public List<Filme> listarFilmes() {
        return filmes;
    }
}
