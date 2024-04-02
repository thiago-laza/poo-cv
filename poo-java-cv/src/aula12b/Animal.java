package aula12b;

public abstract class Animal {
    //Atributos
    protected double peso;
    protected int idade;
    protected int membros;

    //Getters e Setters

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    //Metodos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();



}
