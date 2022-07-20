//Construa um programa que imprima a Tabuada da divisão e multiplicação
//de um determinando inteiro informado pelo usuário. A tabuada deve
//apresentar das operações e os resultados entre o número e os números
//do intervalo entre 1 e 10.

import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = input.nextDouble();

        System.out.println(" 1 x " + num + " = " + (num*1) +
                "\n 2 x " + num + " = " + (num*2) +
                "\n 3 x " + num + " = " + (num*3) +
                "\n 4 x " + num + " = " + (num*4) +
                "\n 5 x " + num + " = " + (num*5) +
                "\n 6 x " + num + " = " + (num*6) +
                "\n 7 x " + num + " = " + (num*7) +
                "\n 8 x " + num + " = " + (num*8) +
                "\n 9 x " + num + " = " + (num*9) +
                "\n 10 x " + num + " = " + (num*10));
    }
}
