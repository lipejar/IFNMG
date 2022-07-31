/*Crie classes cujos objetos devem representar figuras em software de desenho.
Defina os atributos básicos paras desenhar cada uma, e métodos que retornem o
valor de sua área.

        Circulo
        Quadrado
        Triângulo
        Losango
        Retângulo*/

package questao04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("============    MENU    ===========" +
                "\nEscolha o tipo de forma que deseja descobrir a área: " +
                "\n1 - Círculo" +
                "\n2 - Quadrado" +
                "\n3 - Triângulo" +
                "\n4 - Losango" +
                "\n5 - Retângulo");
        int opc = input.nextInt();

        switch(opc){
            case 1:
                Circulo circle = new Circulo();

                System.out.println("Digite o raio do círculo: ");
                circle.raio = input.nextDouble();

                System.out.println("Calculando área...");
                //Pausa de dois seguntos
                try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

                System.out.println("O valor da área do círculo é " + circle.calcArea());

                break;

            case 2:
                Quadrado square = new Quadrado();

                System.out.println("Digite o comprimento do quadrado: ");
                square.comp = input.nextDouble();

                System.out.println("Digite a largura do quadrado: ");
                square.larg = input.nextDouble();

                System.out.println("Calculando área...");
                //Pausa de dois seguntos
                try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

                System.out.println("O valor da área do quadrado é " + square.area());

                break;

            case 3:
                Triangulo triangle = new Triangulo();

                System.out.println("Digite o valor da base do triangulo: ");
                triangle.base = input.nextDouble();

                System.out.println("Digite o valor da altura do triângulo: ");
                triangle.altura = input.nextDouble();

                System.out.println("Calculando área...");
                //Pausa de dois seguntos
                try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

                System.out.println("O valor da área do triângulo é " + triangle.calcArea());

                break;

            case 4:
                Losango lozenge = new Losango();

                System.out.println("Digite o valor da diagonal MAIOR do losango: ");
                lozenge.D = input.nextDouble();

                System.out.println("Digite o valor da diagonal MENOR do losango: ");
                lozenge.d = input.nextDouble();

                System.out.println("Calculando área...");
                //Pausa de dois seguntos
                try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

                System.out.println("O valor da área do lozango é " + lozenge.calcArea());

                break;

            case 5:
                Retangulo retangle = new Retangulo();

                System.out.println("Digite o comprimento do retângulo: ");
                retangle.comp = input.nextDouble();

                System.out.println("Digite a largura do retângulo: ");
                retangle.larg = input.nextDouble();

                System.out.println("Calculando área...");
                //Pausa de dois seguntos
                try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}

                System.out.println("O valor da área do quadrado é " + retangle.area());

                break;

            default:
                System.out.println("======= Opção Inválida =======");
            }
        }
    }

