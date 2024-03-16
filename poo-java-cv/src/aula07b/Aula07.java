package aula07b;

public class Aula07 {
    public static void main(String[] args){
        int tamanhoLinha = 50;
        String linhaHifen = "-".repeat(tamanhoLinha);
        Lutador[] lutadores = new Lutador[6];
        System.out.println(linhaHifen);
        lutadores[0] = new Lutador("Thiago","brasileiro",40,1.65,65,12, 3,4);
        lutadores[0].apresentar();
        System.out.println(linhaHifen);
        lutadores[0].ganharLuta();
        System.out.println(linhaHifen);
        lutadores[0].apresentar();
        System.out.println(linhaHifen);


    }
    
    
}
