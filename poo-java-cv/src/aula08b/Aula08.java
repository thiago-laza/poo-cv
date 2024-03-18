package aula08b;

public class Aula08 {
    public static void main(String[] args){
        int tamanhoLinha = 50;
        String linhaHifen = "-".repeat(tamanhoLinha);
        Lutador[] lutadores = new Lutador[6];
        System.out.println(linhaHifen);
        System.out.println("LUTADOR 1:");
        lutadores[0] = new Lutador("Pretty Boy","Franca",31,1.75,68.9,11, 2,1);
        lutadores[0].apresentar();
        System.out.println(linhaHifen);
        System.out.println("LUTADOR 2:");
        lutadores[1] = new Lutador("Putscript","Brasil",29,1.68,57.8,14,2,3);
        lutadores[1].apresentar();
        System.out.println(linhaHifen);
        System.out.println("LUTADOR 3:");
        lutadores[2] = new Lutador("Snapshadow","EUA",35,1.65,80.9,12,2,1);
        lutadores[2].apresentar();
        System.out.println(linhaHifen);
        System.out.println("LUTADOR 4:");
        lutadores[3] = new Lutador("Dead Code","Australia",28,1.93,81.6,13,0,2);
        lutadores[3].apresentar();
        System.out.println(linhaHifen);
        System.out.println("LUTADOR 5:");
        lutadores[4] = new Lutador("Ufocobol","Brasil",37,1.70,119.3,5,4,3);
        lutadores[4].apresentar();
        System.out.println(linhaHifen);
        System.out.println("LUTADOR 6:");
        lutadores[5] = new Lutador("Nerdaard","EUA",30,1.81,105.7,12,2,4);
        lutadores[5].apresentar();



    }
    
    
}
