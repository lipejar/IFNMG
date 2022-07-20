
import java.util.Scanner;

//Escreva um programa que receba quatro notas de um aluno e imprima a média das notas.

public class questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float sumNotas = 0;
        
        for (int contador = 1;contador<=4;contador++){
            System.out.print("Digite a nota "+contador+":");
            sumNotas += input.nextFloat();
        }
        
        System.out.println("A média das notas é "+(sumNotas/4));
    }
}
