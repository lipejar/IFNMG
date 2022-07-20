
public class questao12 {
    public static void main(String[] args) {
        int X0 = 0;
        int deltaV = 15;
        int deltaT = 50;
        deltaT = 50*60;
        int x = X0 + deltaV*deltaT;
        x = x/1000;
        System.out.println("Distância: " + x + " Km");
}
}
