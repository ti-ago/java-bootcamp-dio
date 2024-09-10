package list.pesquisa.catalogoLivros;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro1", "Autor1", 2020);
        catalogo.adicionarLivro("Livro2", "Autor1", 2021);
        catalogo.adicionarLivro("Livro3", "Autor2", 2022);
        catalogo.adicionarLivro("Livro4", "Autor2", 2020);
        catalogo.adicionarLivro("Livro5", "Autor1", 2023);

        System.out.println(catalogo.pesquisarPorAutor("Autor2"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(1999, 2021));
    }
}
