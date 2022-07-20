//O fatorial de um número n (n pertence ao conjunto dos números naturais) é sempre o produto
//de todos os seus antecessores, incluindo si próprio e excluindo o zero. Exemplo de número
//fatorial: 6! = 6 x 5 x 4 x 3 x 2 x 1 = 720. Construa um programa que solicite do usuário um número
//e imprima o seu fatorial.

import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número natural e eu lhe direi o fatorial desse número: ");
        int num = input.nextInt();
        int result = 1;
        int cont = 0;
        for (cont = num; cont > 0; cont--) {
           result *=  cont;
        }
        System.out.println(num + "! = " + result);
    }
}
