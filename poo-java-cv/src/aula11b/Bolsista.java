package aula11b;
//Bolsista e uma especializacao de Aluno
public class Bolsista extends Aluno{
    private double bolsa;

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(getNome() + " e bolsista! Pagamento facilitado.") ;
    }
}
