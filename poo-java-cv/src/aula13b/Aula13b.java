package aula13b;

public class Aula13b {
    public static void main(String[] args){
        int tamanhoLinha = 50;
        String linhaHifen = "-".repeat(tamanhoLinha);


        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        System.out.println(linhaHifen);
        System.out.println("Sobreposiçao para o metodo emitirSom()");
        m.emitirSom();
        l.emitirSom();
        c.emitirSom();
        System.out.println(linhaHifen);

        System.out.println(linhaHifen);
        System.out.println("Sobrecarga para o metodo reagir()");
        c.reagir("olá");
        c.reagir("vai apanhar");
        c.reagir(11,45);
        c.reagir(21,00);
        c.reagir(false);
        c.reagir(true);
        c.reagir(2,12.5);
        c.reagir(17,4.5);
        System.out.println(linhaHifen);
    }
}
