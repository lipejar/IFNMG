
import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite um número e eu lhe direi se ele é par ou impar: ");
        float num = input.nextFloat();
        
        if (num%2 == 0){
            System.out.println("O número é par");
        } else
            System.out.println("O número é impar");
}
}
