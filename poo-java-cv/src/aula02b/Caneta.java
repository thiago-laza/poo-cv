package aula02b;

public class Caneta {
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //Metodos:
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga (%): " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! nao posso rabiscar.");
        }else {
            System.out.println("Estou rabiscando.");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
