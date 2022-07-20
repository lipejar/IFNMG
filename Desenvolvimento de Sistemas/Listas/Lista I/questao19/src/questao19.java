
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite o número de laranjas compradas: ");
        int num = input.nextInt();
        
        if (num < 12){
            System.out.println("O total a ser pago é: " + (num*0.50) + "R$");
        }
        else {
            System.out.println("O total a ser pago é: " + (num*0.30) + "R$");
        }
}
}
