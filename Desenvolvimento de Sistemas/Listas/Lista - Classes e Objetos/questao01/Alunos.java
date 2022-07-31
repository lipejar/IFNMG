package questao01;

public class Alunos {
    String nome;
    Double matricula;
    Double notaProva1;
    Double notaProva2;
    Double notaProva3;
    Double notaTrabalho;

    Double mediaFim(){
        double media = (this.notaProva1 * 2 + this.notaProva2 * 2 + this.notaProva3 * 2 + this.notaTrabalho * 1.5)/(2+2+2+1.5);
        return media;
    }


}
