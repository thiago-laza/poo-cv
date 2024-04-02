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
        System.out.println("Locomoção: voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação: comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emissão de som: construir ninho");
    }

    //Metodos
    public void fazerNinho(){
        System.out.println("Construir um ninho");
    }
}
