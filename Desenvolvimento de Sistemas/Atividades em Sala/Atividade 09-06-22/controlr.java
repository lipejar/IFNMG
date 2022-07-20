
import java.util.Scanner;


public class controlr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
        System.out.println("Digite um número: ");
        double num1 = input.nextDouble();
        
        System.out.println("Digite outro número: ");
        double num2 = input.nextDouble();
        
        if (num1 > num2){
            System.out.println("O 1º é maior que o 2º número");
        }
        
        else if (num2 > num1){
            System.out.println("O 2º número é maior que o 1º número");
        }
        
        else if (num1 == num2){
            System.out.println("Os números são iguais");
        }
        
    }
}
