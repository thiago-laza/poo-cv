package aula12b;

public class Peixe extends Animal{
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
        System.out.println("Locomoção: nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentação: comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emissão de som: peixe nao faz som");
    }

    //Metodos
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
}
