package aula03b;

import aula03b.Caneta;

public class Aula03b {
    public static void main(String[] args){
        int comprimentoLinha = 50;
        String linhaHifen = "-".repeat(comprimentoLinha);
        //Instanciando a classe Caneta-> criando o objeto c1.
        System.out.println(linhaHifen);
        Caneta c1 = new Caneta();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; -> ERRO! o atributo ponta foi definido como private.
        c1.carga = 80;//atributo definido como protected -> dentro do mesmo pacote -> OK.
        //c1.tampada = true;//atributo definido como protected -> dentro do mesmo pacote -> OK.
        System.out.println("EXIBINDO O STATUS DA CANETA c1.");
        c1.status();
        System.out.println("CHAMANDO O METODO RABISCAR.");
        c1.rabiscar();
        System.out.println(linhaHifen);


    }
}
