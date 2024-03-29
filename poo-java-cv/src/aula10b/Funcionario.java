package aula10b;

public class Funcionario extends Pessoa{
    //Atributos
    private String setor;
    private Boolean trabalhando;
    //Getters e Setteres
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    //Metodos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
}
