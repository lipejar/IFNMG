package questao03;
/*Altere o código da questão anterior, adicionado classes para representar o autor e editora.

        Para o autor deve ser possível armazenar o nome e a data de nascimento.
        Para a editora, deve ser possível armazenar o nome, o CNPJ e o endereço.
        Faça os ajustes na impressão da etiqueta, para que continue funcionando.


        package questao03;*/

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Livros livro = new Livros();


        System.out.println("Digite o Título do livro: ");
        livro.titulo = input.nextLine();

        System.out.println("Digite o nome do autor do livro: ");
        livro.autorLivro.nome = input.nextLine();

        System.out.println("Digite a data de nascimento do autor do livro: ");
        livro.autorLivro.dataNasc = input.nextLine();

        System.out.println("Digite o nome da editora do livro: ");
        livro.editoraLivro.nome = input.nextLine();

        System.out.println("Digite o cnpj desta editora: ");
        livro.editoraLivro.cnpj = input.nextLine();

        System.out.println("Digite o endereço desta editora: ");
        livro.editoraLivro.endereco = input.nextLine();

        System.out.println("Digite o ano de publicação do livro: ");
        livro.anoPubli = Integer.parseInt(input.nextLine());

        livro.etiqueta();
    }
}

