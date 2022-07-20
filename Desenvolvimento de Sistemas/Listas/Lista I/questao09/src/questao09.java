
import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite o valor da cotação atual do dólar: ");
        double cot = input.nextDouble();
        
        System.out.println("Digite um valor a ser convertido em real: ");
        double real = input.nextDouble();
        
        System.out.println("O resultado da conversão é " + (cot*real));
}
}
