
import java.util.Scanner;

//Escreva um programa que solicite o nome, sobrenome, endereço, cidade e estado do usuário e
//em seguida imprima os dados como no exemplo abaixo:

public class questao08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o seu nome e sobrenome: ");
        String nome = input.nextLine();
        
        System.out.println("Digite o seu endereço: ");
        String ender = input.nextLine();
        
        System.out.println("Digite a sua cidade: ");
        String city = input.nextLine();
        
        System.out.println("Digite o seu estado: ");
        String estad = input.nextLine();
        
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: " + ender + "-" + city + "-" + estad);
    }
}
