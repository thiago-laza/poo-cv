package ProjetoYouTube;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected double experiencia;

    //Constructor


    public Pessoa(String nome, int idade, String sexo) {
        this.sexo = sexo;
        this.nome = nome;
        this.idade = idade;
        this.experiencia = 0;
    }

    //Getters e Setters
    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    protected abstract void ganharExp();

    //toSTring

    @Override
    public String toString() {
        return "Pessoa{" +
                "experiencia=" + experiencia +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
