/*Escreva uma classe em que seus objetos representem livros em uma livraria.
Deverá ser possível armazenar o título do livro, a quantidade de páginas,
o ano da publicação, a quantidade de páginas, o nome da editora e o nome do
autor. Construa um método que imprima os detalhes do livro como uma etiqueta.

        Livro:
        Título: Código limpo: Habilidades práticas do Agile Software
        Publicação: 2009
        Autor: Robert C. Martin
        Editora: Alta Books*/

package questao02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Livros livro = new Livros();

        System.out.println("Digite o Título do livro: ");
        livro.titulo = input.nextLine();

        System.out.println("Digite o ano de publicação do livro: ");
        livro.anoPubli = Integer.parseInt(input.nextLine());

        System.out.println("Digite o nome do autor do livro: ");
        livro.autor = input.nextLine();

        System.out.println("Digite o nome da editora do livro: ");
        livro.nomeEditora = input.nextLine();

        livro.etiqueta();
    }
}
