package aula08b;

import aula07b.Lutador;

public class Luta {
    //ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //METODOS ESPECIAIS
    public void marcarLuta(){

    }
    public void lutar(){

    }
    //METODOS ESPECIAIS

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    //METODOS
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && !l1.equals(l2)){
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        }else {
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }

    public void lutar(boolean aprovada){
        aprovada = true;
       if (aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            vencedor = 
        }
    }
}
