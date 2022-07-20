
import java.util.Date;
import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite o ano em que você nasceu: ");
        int ano = input.nextInt();
        Date anoSistema = new Date();
        int anoAtual = anoSistema.getYear() + 1900;
        
        int idadeVotar = anoAtual-ano;
        if (idadeVotar <16) {
            System.out.println("Você só poderá votar caso faça 16 anos neste ano");
        } else if (idadeVotar >= 16 && idadeVotar<18 || idadeVotar>70) {
            System.out.println("O voto é opcional");
        } else if (idadeVotar>=18 && idadeVotar<70) {
            System.out.println("O voto é obrigatório");
        }
        
        System.out.println(anoAtual);
}
}
