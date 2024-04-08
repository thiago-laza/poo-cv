package ProjetoYouTube;

public class Gafanhoto extends Pessoa{
    //Atributos
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome,int idade,  String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }


    //Getters e Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }


    //toString


    @Override
    public String toString() {
        return "Gafanhoto{" +
                "sexo='" + sexo + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", experiencia=" + experiencia +
                ", totAssistido=" + totAssistido +
                ", login='" + login + '\'' +
                '}';
    }

    //Metodos
    public void viuMaisUm(){
        setTotAssistido(getTotAssistido() + 1);
    }

    //Metodo da classe mae(Pessoa)
    @Override
    protected void ganharExp() {

    }
}
