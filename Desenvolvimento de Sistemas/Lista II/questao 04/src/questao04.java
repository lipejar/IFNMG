//Construa um programa que exiba um menu com 4 opções: 1 - Somar, 2 – Subtrair,
//3- Multiplicar e 4 – Dividir e 5 - Sair. Ao escolher uma das opções entre 1 e 4 o
//programa deve solicitar que o usuário informe dois números, calcular a operação
//escolhida e imprimir o resultado e apresentar o menu novamente. Ao selecionar a
//opção 5 o programa deve ser finalizado.

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        double num1 = 0;
        double num2 = 0;

        while (menu != 5){
            System.out.println("Escolha uma opção do menu" +
                    "\n 1 - Somar;" +
                    "\n 2 - Subtrair" +
                    "\n 3 - Multiplicar" +
                    "\n 4 - Dividir" +
                    "\n 5 - Sair");
            menu = input.nextInt();

            if (menu == 1){
                System.out.println("Digite o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = input.nextDouble();

                System.out.println("A soma dos dois números é " + (num1+num2));
            }

            else if (menu == 2){
                System.out.println("Digite o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = input.nextDouble();

                System.out.println("A subtração dos dois números é " + (num1-num2));
            }

            else if (menu == 3){
                System.out.println("Digite o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = input.nextDouble();

                System.out.println("A multiplicação dos dois números é " + (num1*num2));
            }

            else if (menu == 4){
                System.out.println("Digite o primeiro número: ");
                num1 = input.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = input.nextDouble();

                System.out.println("A divisão entre os dois números é " + (num1/num2));
            }
        }
    }
}
