package aula12b;

public class Mamifero extends Animal{
    //Atributos
    private String corPelo;

    //Getters e Setters

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //Metodos da classe mae Animal
    @Override
    public void locomover() {
        System.out.println("Locomoção: correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação: mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emissão de som: som de mamifero");
    }




}
