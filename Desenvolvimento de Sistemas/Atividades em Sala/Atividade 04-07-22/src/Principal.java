public class Principal {
    public static void main(String[] args) {
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
    }
}
