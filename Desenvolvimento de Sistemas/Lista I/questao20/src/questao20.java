import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int numeros = 0;
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = input.nextInt();
        
        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = input.nextInt();
        
        if (num2<num1 && num2<num3) {
            System.out.println("O menor número é o segundo: " + num2);
        } else if (num1<num3 && num1<num2) {
            System.out.println("O menor número é o primeiro: " + num1);
        } else if (num3<num2 && num3<num1) {
            System.out.println("O menor número é o terceiro: " + num3);
        } else {
            System.out.println("Os números são iguais.");
        }
}
}
