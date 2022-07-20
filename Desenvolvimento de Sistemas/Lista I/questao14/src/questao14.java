
import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite um número inteiro: ");
        int num1 = input.nextInt();
        
        System.out.println("Dite outro número inteiro: ");
        int num2 = input.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " É o maior número");
        }
        else {
            System.out.println(num2 + " É o maior número");
        }
}
}
