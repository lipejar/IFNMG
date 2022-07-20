//Uma pizzaria fornece 10% de desconto para funcionários e 5% de desconto para clientes vips.
//Faça um programa que calcule o valor total a ser pago pela venda de uma pizza. O programa
//deverá ler o valor da compra e um código que indica o tipo de cliente: 1-Comum, 2-Vip e 3-
//Funcionário.

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;

        System.out.print("Digite o valor total da compra: ");
        float compra = input.nextFloat();

        System.out.println("Digite o código do tipo de cliente" +
                "\n 1- Comum" +
                "\n 2- Vip" +
                "\n 3- Funcionário");
        menu = input.nextInt();

        if (menu == 1){
            System.out.println("O valor total a ser pago é R$" + compra);
        }

        if (menu == 2){
            double desc = compra-((compra/100)*5);
            System.out.println("O valor total a ser pago é R$" + desc);
        }

        if (menu == 3){
            double desc = compra-((compra/100)*10);
            System.out.println("O valor total a ser pago é R$" + desc);
        }
    }
}
