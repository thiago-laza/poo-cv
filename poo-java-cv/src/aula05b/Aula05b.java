package aula05b;

public class Aula05b {
    public static void main(String[] args){
        int tamanhoLinha = 50;
        String linhaHifen = "-".repeat(tamanhoLinha);
        //Instanciando a classe->criando o objeto p1:
        ContaBanco p1 = new ContaBanco();
        System.out.println(linhaHifen);
        p1.setNumConta(1234);
        p1.setDono("Thiago");
        p1.abrirConta("CC");
        p1.estadoAtual();
        System.out.println(linhaHifen);
        //Instanciando a classe->criando o objeto p2:
        ContaBanco p2 = new ContaBanco();
        System.out.println(linhaHifen);
        p2.setNumConta(4321);
        p2.setDono("Fabiana");
        p2.abrirConta("CP");
        p2.estadoAtual();
        System.out.println(linhaHifen);
        //Usando o metodo depositar:
        System.out.println(linhaHifen);
        p1.depositar(100);
        p1.estadoAtual();
        System.out.println(linhaHifen);
        p2.depositar(500);
        p2.estadoAtual();
        System.out.println(linhaHifen);
        //Usando o metodo sacar
        System.out.println(linhaHifen);
        p1.sacar(40);
        p1.estadoAtual();
        System.out.println(linhaHifen);
        p2.sacar(200);
        p2.estadoAtual();
        System.out.println(linhaHifen);
        p1.sacar(2000);
        p1.estadoAtual();
        System.out.println(linhaHifen);
        p2.sacar(2000);
        p2.estadoAtual();
        System.out.println(linhaHifen);
        //Usando o metodo fechar conta
        System.out.println(linhaHifen);
        p1.fecharConta();
        p1.estadoAtual();
        System.out.println(linhaHifen);
        p2.fecharConta();
        p2.estadoAtual();
        System.out.println(linhaHifen);
        p1.sacar(110);
        p1.fecharConta();
        p1.estadoAtual();
        System.out.println(linhaHifen);
        p2.sacar(450);
        p2.fecharConta();
        p2.estadoAtual();
        System.out.println(linhaHifen);


    }
}
