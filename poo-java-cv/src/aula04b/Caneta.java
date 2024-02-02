package aula04b;

public class Caneta {
    //ATRIBUTOS
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    //METODO CONSTRUCT
    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

   //METODOS GETTERS E SETTERS
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    //METODOS
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga (%): " + this.carga);
        System.out.println("Tampada: " + this.tampada);
        if (this.tampada == false){
            System.out.println("Sendo usad.");
        }else{
            System.out.println("Nao podendo ser usada");
        }
    }



}





