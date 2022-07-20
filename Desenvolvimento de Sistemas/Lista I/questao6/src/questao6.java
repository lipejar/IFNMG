
import java.util.Scanner;

/*Reescreva o programa anterior para que solicite do usuário a quantidade de metros que deseja
converter e depois de realizar a conversão informe ao usuário a quantidade de polegadas.*/

public class questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de metros que deseja converter em polegadas: ");
        float metros = input.nextFloat();
        
        System.out.println(metros+" metros convertidos em polegadas são: "+(metros*39.3700787));
    }
    
}
