package cadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilmeService filmeService = new FilmeService();
        SerieService serieService = new SerieService();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar filme");
            System.out.println("2. Cadastrar série");
            System.out.println("3. Listar filmes");
            System.out.println("4. Listar séries");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Título do filme: ");
                    String tituloFilme = sc.nextLine();
                    System.out.print("Ano de lançamento: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    filmeService.cadastrarFilme(new Filme(tituloFilme, ano));
                    System.out.println("✅ Filme cadastrado!");
                    break;
                case 2:
                    System.out.print("Título da série: ");
                    String tituloSerie = sc.nextLine();
                    System.out.print("Número de temporadas: ");
                    int temporadas = sc.nextInt();
                    sc.nextLine();
                    serieService.cadastrarSerie(new Serie(tituloSerie, temporadas));
                    System.out.println("✅ Série cadastrada!");
                    break;
                case 3:
                    System.out.println("\n--- Filmes ---");
                    filmeService.listarFilmes().forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("\n--- Séries ---");
                    serieService.listarSeries().forEach(System.out::println);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("❌ Opção inválida!");
            }
        }
    }
}
