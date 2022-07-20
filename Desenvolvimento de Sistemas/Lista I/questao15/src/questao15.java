
import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite o seu peso: ");
        double peso = input.nextDouble();
        
        System.out.println("Digite a sua altura: ");
        double alt = input.nextDouble();
        
        double IMC = peso/(alt*alt);
        
        System.out.println("O seu imc é "+ IMC);
        
         if (IMC<18.5) {
            System.out.println("Classificação: Magreza");
        } else if (IMC>=18.5 && IMC<=24.9) {
            System.out.println("Classificação: Saudável");
        } else if (IMC>=25 && IMC <=29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (IMC>=30 & IMC<=34.9) {
            System.out.println("Classificação: Obesidade grau 1");
        } else if (IMC>=35 && IMC<=39.9) {
            System.out.println("Classificação: Obesidade grau 2 (severa)");
        } else if (IMC>=40) {
            System.out.println("Classificação: Obesidade grau 3 (morbida)");
     }
}
}
