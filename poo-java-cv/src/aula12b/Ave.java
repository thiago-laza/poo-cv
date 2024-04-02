package aula12b;

public class Ave extends Animal{
    //Atributos
    private String corPena;

    //Getters e Setteres

    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }


    //Metodos da classe mae Animal
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Construir ninho");
    }

    //Metodos
    public void fazerNinho(){
        System.out.println("Construir um ninho");
    }
}
