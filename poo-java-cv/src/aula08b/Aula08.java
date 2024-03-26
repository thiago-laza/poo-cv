package aula08b;

public class Aula08 {
    public static void main(String[] args){
        int tamanhoLinha = 50;
        String linhaHifen = "-".repeat(tamanhoLinha);
        Lutador[] lutadores = new Lutador[6];

        //Instanciando a classe lutador
        lutadores[0] = new Lutador("Pretty Boy","Franca",31,1.75,68.9,11, 2,1);
        lutadores[1] = new Lutador("Putscript","Brasil",29,1.68,57.8,14,2,3);
        lutadores[2] = new Lutador("Snapshadow","EUA",35,1.65,80.9,12,2,1);
        lutadores[3] = new Lutador("Dead Code","Australia",28,1.93,81.6,13,0,2);
        lutadores[4] = new Lutador("Ufocobol","Brasil",37,1.70,119.3,5,4,3);
        lutadores[5] = new Lutador("Nerdaard","EUA",30,1.81,105.7,12,2,4);

        //Mostrando os lutadores
        System.out.println(linhaHifen);
        lutadores[0].apresentar();
        System.out.println(linhaHifen);
        lutadores[1].apresentar();
        System.out.println(linhaHifen);
        lutadores[2].apresentar();
        System.out.println(linhaHifen);
        lutadores[3].apresentar();
        System.out.println(linhaHifen);
        lutadores[4].apresentar();
        System.out.println(linhaHifen);
        lutadores[5].apresentar();
        System.out.println(linhaHifen);

        System.out.println("Usando os metodos.");

        //Usando os metodos ganharLuta, perderLuta e empatarLuta
        lutadores[0].ganharLuta();
        lutadores[1].empatarLuta();
        lutadores[2].perderLuta();
        lutadores[3].ganharLuta();
        lutadores[4].empatarLuta();
        lutadores[5].empatarLuta();

        System.out.println(linhaHifen);
        lutadores[0].apresentar();
        System.out.println(linhaHifen);
        lutadores[1].apresentar();
        System.out.println(linhaHifen);
        lutadores[2].apresentar();
        System.out.println(linhaHifen);
        lutadores[3].apresentar();
        System.out.println(linhaHifen);
        lutadores[4].apresentar();
        System.out.println(linhaHifen);
        lutadores[5].apresentar();
        System.out.println(linhaHifen);

        //Usando a classe luta (Agragacao)
        System.out.println(linhaHifen);
        Luta luta1 = new Luta();
        luta1.marcarLuta(lutadores[2],lutadores[3]);
        luta1.lutar();



    }
    
    
}
