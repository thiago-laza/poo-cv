package aula11b;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        System.out.println("Especialidade: " + getEspecialidade());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        System.out.println("Salario: R$ " + getSalario());
    }

    public void receberAumento(){
        Double novoSalario = salario * 1.25;
        System.out.println("Salario com aumento: R$ " + novoSalario);
    }
}
