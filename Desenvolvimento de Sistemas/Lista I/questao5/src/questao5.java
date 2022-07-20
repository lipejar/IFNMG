/*Um profissional precisa de um software que converta valores em metros para valores em
polegadas. Sabendo que 1 metro equivale a 39,3700787 polegadas, crie um programa que faça
o cálculo de quantas polegadas equivale a 30 metros.*/


public class questao5 {
    public static void main(String[] args) {
        float metro = 30;
        final double polegada = 39.3700787;
        
        System.out.println(metro+" metros equivalem a "+(polegada*metro)+" polegadas");
    }
}
