//3. Construa um programa conversor de escalas de temperaturas. O usuário deverá escolher de
//qual escala para qual escala deseja fazer a conversão, solicitar o valor e em seguida imprimir o
//valor correspondente na nova escala:
//1. Celsius para Kelvin
//2. Celsius para Fahrenheit
//3. Fahrenheit para Celsius
//4. Kelvin para Celsius
//5. Fahrenheit para Kelvin
//6. Kelvin para Fahrenheit
//7. Sair do Programa

import java.util.Scanner;

public class questao07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        double num = 0;

        while (menu != 7){
            System.out.println("Qual escala deseja?" +
                    "\n 1. Celsius para Kelvin" +
                    "\n 2. Celsius para Fahrenheit" +
                    "\n 3. Fahrenheit para Celcius" +
                    "\n 4. Kelvin para Celcius" +
                    "\n 5. Fahrenheit para Kelvin" +
                    "\n 6. Kelvin para Fahrenheit" +
                    "\n 7. Sair do programa");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Digite o valor em Celsius a ser convertido: ");
                    num = input.nextDouble();
                    System.out.println(num + "Cº convertido em Kelvin é: " + (num + 273.15) + "Cº");
                    break;

                case 2:
                    System.out.println("Digite o valor em Celsius a ser convertido: ");
                    num = input.nextDouble();
                    System.out.println(num + "Cº convertido em Fahrenheit é: " + (num * 1.8 + 32) + "Fº");
                    break;

                case 3:
                    System.out.println("Digite o valor em Fahrenheit a ser convertido: ");
                    num = input.nextDouble();
                    System.out.println(num + "Fº convertido em Celsius é: " + ((num-32)/1.8) + "Cº");
                    break;

                case 4:
                    System.out.println("Digite o valor em Kelvin a ser convertido: ");
                    num = input.nextDouble();
                    System.out.println(num + "K convertido em Celsius é: " + (num-273.15) + "Cº");
                    break;

                case 5:
                    System.out.println("Digite o valor em Fahrenheit a ser convertido: ");
                    num = input.nextDouble();
                    System.out.println(num + "Fº convertido em Kelvin é: " + ((num-32) * 5/9 + 273.15) + "K");
                    break;

                case 6:
                    System.out.println("Digite o valor em Kelvin a ser convertido: ");
                    num = input.nextDouble();
                    System.out.println(num + "K convertido em Farenheit é: " + ((num-273.15) * 9/5 + 32) + "Fº");
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Você digitou um número sem correspondencia!");
                    break;
            }
        }

    }
}
