
import java.util.Scanner;

public class questao18 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite a senha válida: ");
        int senha = input.nextInt();
        
        if(senha == 1234){
            System.out.println("ACESSO PERMITIDO");
            
        }
        else{
            System.out.println("ACESSO NEGADO");
        }
}
}
