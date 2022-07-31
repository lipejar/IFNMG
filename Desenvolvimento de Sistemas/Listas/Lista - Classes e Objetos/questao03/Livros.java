package questao03;


public class Livros {
    String titulo;
    int numPag;
    int anoPubli;
    Editora editoraLivro = new Editora();
    Autor autorLivro = new Autor();

    void etiqueta(){
        System.out.println("Livro: \nTítulo: " + this.titulo +
                "\nPublicação: " + this.anoPubli +
                "\nAutor: " + this.autorLivro.nome +
                "\nEditora: " + this.editoraLivro.nome);
    }

}
