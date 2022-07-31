/*Crie uma classe para representar alunos matriculados em uma determinada disciplina.
Cada objeto deve armazenar o nome do aluno, sua matrícula,
3 notas de provas e 1 nota de um trabalho.

        Construa um método para calcular e retornar a
        média final do aluno, cada prova tem peso 2 e
        o trabalho peso 1,5.*/


package questao01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Alunos matricula = new Alunos();

        System.out.println("Digite o nome do aluno: ");
        matricula.nome = input.nextLine();

        System.out.println("Digite o número da matrícula do aluno: ");
        matricula.matricula = input.nextDouble();

        System.out.println("Digite a nota da primeira prova: ");
        matricula.notaProva1 = input.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        matricula.notaProva2 = input.nextDouble();

        System.out.println("Digite a nota da terceira prova: ");
        matricula.notaProva3 = input.nextDouble();

        System.out.println("Digite a nota do trabalho: ");
        matricula.notaTrabalho = input.nextDouble();

        System.out.println("Calculando média...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("O aluno " + matricula.nome + " com o número de matricula " + matricula.matricula + " obteve a nota final " + matricula.mediaFim());

    }
}
