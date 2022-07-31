package questao02;

public class Livros {
    String titulo;
    int numPag;
    int anoPubli;
    String nomeEditora;
    String autor;

    void etiqueta(){
        System.out.println("Livro: \nTítulo: " + this.titulo +
                "\nPublicação: " + this.anoPubli +
                "\nAutor: " + this.autor +
                "\nEditora: " + this.nomeEditora);
    }

}
