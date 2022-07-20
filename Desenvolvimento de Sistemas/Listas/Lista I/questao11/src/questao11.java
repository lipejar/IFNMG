
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite um valor em horas: ");
        double hr = input.nextDouble();
        
        System.out.println(hr+" horas equivalem a "+ (hr*60) + " minutos");
}
}
