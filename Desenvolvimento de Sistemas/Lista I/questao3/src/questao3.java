
import java.util.Scanner;

/*Escreva um programa que receba dois números inteiros e imprima o resultado da
divisão inteira entre os números bem como o resto dessa divisão.*/

public class questao3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();
        
        System.out.println("A divisão dos dois números inteiros é: "+(num1/num2));
        System.out.println("O resto da divisão desses números é: "+(num1%num2));
}
}
