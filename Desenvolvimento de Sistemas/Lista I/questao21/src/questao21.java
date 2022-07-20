
import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
        System.out.print("Digite a primeira medida: ");
        double medida1 = input.nextDouble();
        
        System.out.print("Digite a segunda medida: ");
        double medida2 = input.nextDouble();
        
        System.out.print("digite a terceira medida: ");
        double medida3 = input.nextDouble();
        
        if (medida1 == medida2 && medida2 == medida3) {
            System.out.println("O triângulo é Equilátero");
        } else if (medida1 == medida2 && medida2 != medida3 || medida1 == medida3 && medida3 != medida2 
                || medida2 == medida3 && medida3 != medida1) {
            System.out.println("O triângulo é Isósceles");
        } else if (medida1 != medida2 && medida1 != medida3 && medida2 != medida3) {
            System.out.println("O triângulo é Escaleno");
        }
}
}
