package aula12b;

public class Reptil extends Animal{
    //Atributos
    private String corEscama;

    //Getters e Setters

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //Metodos da classe mae Animal
    @Override
    public void locomover() {
        System.out.println("Locomoção: rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação: comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emissão de som: som de reptil");
    }
}
