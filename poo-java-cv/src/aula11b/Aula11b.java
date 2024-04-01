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
        System.out.println("testanddo hp");

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
        System.out.println("Instanciando a classe Bolsista");
        b1.fazerAniv();
        System.out.println(b1.toString());
        System.out.println("Matricula: " + b1.getMatricula());
        System.out.println("Curso: " + b1.getCurso());
        b1.setBolsa(250);
        b1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println(linhaHifen);

        //Instanciando a classe Professor
        Professor p1 = new Professor();
        p1.setNome("Vidal");
        p1.setIdade(50);
        p1.setSexo("M");
        System.out.println("Instanciando a classe Professor");
        p1.fazerAniv();
        System.out.println(p1.toString());
        p1.setEspecialidade("Matematica");
        p1.setSalario(6580.45);
        p1.receberAumento();
        System.out.println(linhaHifen);

        //Instanciando a classe Tecnico
        Tecnico t1 = new Tecnico();
        t1.setNome("Paulo");
        t1.setIdade(20);
        t1.setSexo("M");
        t1.setMatricula(258741);
        t1.setCurso("C#");
        t1.setRegistroProfissional(854796);
        System.out.println("Instanciando a classe Tecnico");
        t1.fazerAniv();
        System.out.println(t1.toString());
        System.out.println("Matricula: " + t1.getMatricula());
        System.out.println("Curso: " + t1.getCurso());
        System.out.println("Registro profissional: " + t1.getRegistroProfissional());
        t1.pagarMensalidade();
        t1.praticar();
    }
}
