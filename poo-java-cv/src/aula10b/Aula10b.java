package aula10b;

public class Aula10b {
    public static void main(String[] args){

        int tamanhoLinha = 50;
        String linhaHifen = "-".repeat(tamanhoLinha);


        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        //Instanciando as classes Pessoa, Aluno, Professor e Funcionario (toString na classe mae Pessoa)

        p1.setNome("Thiago");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setIdade(15);
        p2.setIdade(10);
        p3.setIdade(40);
        p4.setIdade(45);

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        System.out.println(linhaHifen);
        System.out.println(p1.toString());
        System.out.println(linhaHifen);
        System.out.println(p2.toString());
        System.out.println(linhaHifen);
        System.out.println(p3.toString());
        System.out.println(linhaHifen);
        System.out.println(p4.toString());
        System.out.println(linhaHifen);
    }
}
