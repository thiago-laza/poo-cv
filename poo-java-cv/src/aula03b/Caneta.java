package aula03b;

public class Caneta {
    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    //Metodos:
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga (%): " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! nao posso rabiscar.");
        }else {
            System.out.println("Estou rabiscando.");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
    //obs: colocando private em tampada e rabiscar sendo public, o objeto pode "usar" o atributo via rabiscar
    //pois rabiscar e tampada estao na mesma classe.
}
