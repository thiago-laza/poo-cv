package aula13b;

public class Mamifero extends Animal{
    //Atributos
    protected String corPelo;
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero.");
    }
}
