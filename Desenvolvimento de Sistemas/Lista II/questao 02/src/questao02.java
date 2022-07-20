//Construa um programa para encontrar todos os números pares entre 1 e 100.

public class questao02 {
    public static void main(String[] args) {
        int num = 0;

        while (num!=100){
            num++;

            if ((num%2)==0){
                System.out.println(num);
            }
        }
    }
}
