
import java.util.Scanner;

/*Escreva um programa que receba dois números decimais, armazene a soma dos dois em uma
nova variável e em seguida imprima o resultado.*/

public class questao2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite um número decimal: ");
    float num1 = input.nextFloat();
    
    System.out.print("Digite outro número decimal: ");
    float num2 = input.nextFloat();
        
    float sum = num1+num2;
    
        System.out.println("A soma dos dois valores é "+sum);
}
}
