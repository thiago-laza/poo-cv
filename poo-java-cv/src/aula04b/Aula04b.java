package aula04b;

public class Aula04b {
    public static void main(String[] args) {
        int comprimentoLinha = 70;
        String linhaHifen = "-".repeat(comprimentoLinha);
        System.out.println(linhaHifen);
        Caneta c1 = new Caneta("modelo", "cor", 0f, 0, true);
        //MODIFICANDO OS ATRIBUTOS -SETTERS:
        System.out.println("Modificando os atributo modelo e ponta usando Setteres:");
        c1.setModelo("BIC.");
        c1.setCor("Preta.");
        c1.setPonta(0.5f);
        c1.setCarga(80);
        c1.setTampada(false);
        c1.status();
        System.out.println(linhaHifen);
        //ACESSANDO O VALOR DOS ATRIBUTOS - GETTERS
        System.out.println("Acessando informacoes dos atributos via Getteres:");
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Ponta: " + c1.getPonta());
        System.out.println("Carga (%): " + c1.getCarga());
        System.out.println("Tampada: " + c1.isTampada());
        System.out.println(linhaHifen);
        //ACESSANDO OS ATRIBUTOS A PARTIR DO METODO CONSTRUCT
        System.out.println("Acessando informacoes dos atributos via metodo construct.");
        Caneta c2 = new Caneta("Pentel", "Verde", 0.9f, 75, true
        );
        c2.status();
        System.out.println(linhaHifen);
    }
}
