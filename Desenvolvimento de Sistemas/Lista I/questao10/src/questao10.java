
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite um valor de minutos: ");
        double min = input.nextDouble();
        
        System.out.println(min + " minutos convertidos em horas são: "+ (min/60));
    }
}
