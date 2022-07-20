//Construa um programa que solicite infinitos números inteiros ao usuário, e ao informar o valor
//“0”, o programa imprima quantos números pares foram digitados.

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        int numpar = 0;
        double numdig = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enquanto você não digitar 0, eu irei contar quantos números pares você escreveu!");

        while (numdig != 0){
            System.out.println("Digite o número: ");
            numdig = input.nextDouble();

            if ((numdig%2) == 0){
                numpar++;
            }
        }

        System.out.println("Foram digitados " + (numpar-1) + " números pares!");
    }
}
