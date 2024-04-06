package aula12b;

public class Canguru extends Mamifero{
    //Metodos
    public void usarBolsa(){
        System.out.println("Usando a bolsa");
    }
    @Override
    public void locomover(){
        System.out.println("Locomoção: pulando");
    }
}
