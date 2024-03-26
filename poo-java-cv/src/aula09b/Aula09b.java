package aula09b;

public class Aula09b {
    public static void main(String[] args){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Criando vetores Pessoas e Livros
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        //Instanciando as classes Pessoas e Livros
        p[0] = new Pessoa("Thiago",40,"M");
        p[1] = new Pessoa("Jose", 45, "M");
        p[2] = new Pessoa("Maria", 35, "F");

        l[0] = new Livro("POO", "Guanabara", 200, p[0]);
        l[1] = new Livro("Python", "Paulo Silveira", 500, p[1]);
        l[2] = new Livro("Linux", "Akita", 800, p[2]);

        l[1].abrir();
        l[1].folhear(450);
        l[1].avancarPag();
        l[1].detalhes();




    }
}
