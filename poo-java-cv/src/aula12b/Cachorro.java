package aula12b;

public class Cachorro extends Mamifero{
    //Metodos
    public void enterrarOsso(){
        System.out.println("Enterrando o osso.");
    }
    public void abanarRabo(){
        System.out.println("Abanado o rabo");
    }
    @Override
    public void emitirSom(){
        System.out.println("Emissão de som: Au! Au! Au!");
    }
}
