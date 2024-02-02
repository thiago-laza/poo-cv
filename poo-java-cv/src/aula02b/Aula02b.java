package aula02b;

public class Aula02b {
    public static void main(String[] args){
        int comprimentoLinha = 50;
        String linhaHifen = "-".repeat(comprimentoLinha);
        //Instanciando a classe caneta->criando o objeto caneta c1.
        System.out.println(linhaHifen);
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampada = false;
        System.out.println("EXIBINDO O METODO STATUS PARA A CANETA c1.:");
        c1.status();
        System.out.println("CHAMANDO O METODO RABISCAR PARA A CANETA c1.");
        c1.rabiscar();
        //Instanciando a classe caneta->criando o objeto caneta c2.
        System.out.println(linhaHifen);
        Caneta c2 = new Caneta();
        c2.modelo = "pentel";
        c2.cor = "preta";
        c2.ponta = 0.7f;
        c2.carga = 70;
        c2.tampada = true;
        System.out.println("EXIBINDO O METODO STATUS PARA A CANETA c2.");
        c2.status();
        System.out.println("CHAMANDO O METODO RABISCAR PARA A CANETA c2.");
        c2.rabiscar();
        System.out.println(linhaHifen);

    }
}
