package aula09b;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Constructo
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    //Metodos getteres e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Metodos
    public void fazerAniver(){
        this.idade = this.idade + 1;
    }
    public void mostrarPessoa(){
        System.out.println("Leitor");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }

}
