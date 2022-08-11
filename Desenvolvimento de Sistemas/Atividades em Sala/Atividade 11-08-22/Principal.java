import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int notas[] = new int[5];
        
        System.out.println("-----------------------------------------");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + i + ": ");
            notas[i] = input.nextInt();
        }
        System.out.println("-----------------------------------------");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + i + ": " + notas[i]);
        }
        input.close();
    }
}