
import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.println("Digite a duração do tempo em minutos da queda de uma pedra: ");
        double deltaT = input.nextDouble();
        
        double g = 20.2; 
        double t = deltaT * 60; 
        double H = (g*(t*t))/2; 
        double conversao = H/1000; 
        System.out.println("A altura necessária para que a pedra caia em "+deltaT+" minutos é de: "+conversao+" Km");
}
}
