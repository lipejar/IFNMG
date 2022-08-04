public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    //Função inserir nome
    public void setNome (String novoNome) {
        this.nome = novoNome;
    }


    //Função inserir sobrenome
    public void setSobrenome (String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //Função inserir cpf
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }


    //Funç�

    public Boolean isTesteNome(){
        return this.nome!=null;

    }

    //Função retornar nome
    public String getNome() {
        return this.nome;
    }

    //Função retornar sobrenome
    public String getSobrenome() {
        return this.sobrenome;

    }

    //Função retornar cpf
    public String getCpf () {
        return this.cpf;
    }
}