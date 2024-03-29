package aula11b;

public class Aula11b {
    public static void main(String[] args){

        int tamanhoLinha = 50;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Pessoa p1 = new Pessoa(); -> Pessoa nao pode ser instanciada, pois e uma classe abstrata.

        //Instanciando a classe Visitante / obs: heranca pobre
        Visitante v1 = new Visitante();
        v1.setNome("Thiago");
        v1.setIdade(40);
        v1.setSexo("M");
        System.out.println(linhaHifen);
        System.out.println("Instanciando a classe visitante.");
        v1.fazerAniv();
        System.out.println(v1.toString());
        System.out.println(linhaHifen);

        //Instanciando a classe Aluno
        Aluno a1 = new Aluno();
        a1.setNome("Vinicius");
        a1.setIdade(17);
        a1.setSexo("M");
        a1.setMatricula(314271);
        a1.setCurso("Java");
        System.out.println("Instanciando a classe Aluno:");
        a1.fazerAniv();
        System.out.println(a1.toString());
        System.out.println("Matricula: " + a1.getMatricula());
        System.out.println("Curso: " + a1.getCurso());
        a1.pagarMensalidade();
        System.out.println(linhaHifen);

        //Instanciando a classe Bolsista
        Bolsista b1 = new Bolsista();
        b1.setNome("Jose");
        b1.setIdade(20);
        b1.setSexo("M");
        b1.setMatricula(142563);
        b1.setCurso("Python");
        b1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println(b1.toString());
        System.out.println(linhaHifen);
    }
}
