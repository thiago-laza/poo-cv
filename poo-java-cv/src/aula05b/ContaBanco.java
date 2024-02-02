package aula05b;
public class ContaBanco {


    //ATRIBUTOS:
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //EXIBINDO OS ATRIBUTOS INSTANCIADOS
    public void estadoAtual(){
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }

    //CONSTRUCT:
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //METODOS ESPECIAIS(GETTERS E SETTERS)
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    //METODOS:
    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
        if (getTipo().equals("CC")){
            setSaldo(50);
        }else if (getTipo().equals("CP")){
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso.");
    }
    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("Conta com dinheiro.");
        }else if (getSaldo() < 0){
            System.out.println("Conta em debido.");
        }else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    public void depositar(float valor){
        if (getStatus()){
            setSaldo(getSaldo() + valor);//saldo+=valor
            System.out.println("Deposito realizado  na conta de " + getDono());
        }else {
            System.out.println("Impossivel depositar em uma conta fechada.");
        }
    }
    public void sacar(float valor){
        if (getStatus()){
            if (getSaldo() >= valor){
                setSaldo(getSaldo() - valor);//saldo-=valor
                System.out.println("Saque realizado na conta de " + getDono());
            }else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }else {
            System.out.println("Impossivel sacar de uma conta fechada.");
        }
    }
    public void pagarMensal(){
        int valor = 0;
        if (getTipo().equals("CC")){
            valor = 12;
        }else if (getTipo().equals("CP")){
            valor = 20;
        }
        if(getStatus()){
            if(getSaldo() > valor){
                setSaldo(getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso por " + getDono());
            }else {
                System.out.println("Saldo insuficiente.");
                System.out.println("Impossivel pagar uma conta fechada.");
            }
        }else {
            System.out.println("Impossivel pagar.");
        }
    }
}
