import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Carro carroCliente;
        carroCliente = new Carro();

        carroCliente.dono = "Felipe Fernandes Jardim";
        carroCliente.anoDeFabricacao = 2022;
        carroCliente.marca = "Ferrari";
        carroCliente.fabricante = "Continental AutoSports Ferrari";

        Gato gatoVizinha;
        gatoVizinha = new Gato();

        gatoVizinha.dono = "Maria Eduarda Reis de Oliveira";
        gatoVizinha.idade = 3;
        gatoVizinha.nome = "Netuno Robson";
        gatoVizinha.rg = 0;
        gatoVizinha.raca = "Ciamês";

        System.out.println("Gato");
        System.out.println(String.format("Nome: %s \nIdade: %s\nRaça: %s", gatoVizinha.nome,gatoVizinha.idade, gatoVizinha.raca));

        System.out.println("Carro");
        System.out.println(String.format("Dono: %s \nAno de Fabricação: %s\nMarca: %s\nFabricante: %s", carroCliente.dono,carroCliente.anoDeFabricacao, carroCliente.marca, carroCliente.anoDeFabricacao));

        //Alterar nome do gato da vizinha
        System.out.println("Digite o nome que queira alterar o gato: ");
        String novoNome = input.next();

        gatoVizinha.alterarNome(novoNome);

        System.out.println("A partir de agora, nome do gato da vizinha é " + gatoVizinha.nome);
        //Fim Alterar nome do gato

        System.out.println("Digite o nome do novo dono do carro: ");
        String novoDono = input.next();

        carroCliente.alterarDono(novoDono);

        System.out.println("A partir de agora, o nome do novo dono do carro é " + carroCliente.dono);

    }
}
