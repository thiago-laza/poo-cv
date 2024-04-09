package ProjetoYouTube;

public class ProjetoYouTube {
    public static void main(String[] args){
        int tamanhoLinha = 50;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Instanciando a classe Video
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aual 10 e HTML5");

        //Instanciando a classe Gafanhor
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Thiago", 40, "M", "laza");
        g[1] = new Gafanhoto("Fabiana", 42, "F", "fabi");
        g[2] = new Gafanhoto("Dobby", 10, "M", "gato");

        //Instanciando a classe Visualizacao
        Visualizacao vs[] = new Visualizacao[5];

        //Instanciando Gafanhoto e Video
        System.out.println(linhaHifen);
        System.out.println("Intanciando um Gafanhoto e um video.");
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        System.out.println(linhaHifen);

        //Instanciando uma Visualizacao de um Gafanhoto e um Video
        System.out.println(linhaHifen);
        vs[0] = new Visualizacao(g[0],v[0]);
        System.out.println("Instanciando uma visualizacao.");
        System.out.println(vs[0].toString());
        System.out.println(linhaHifen);

        //Instanciando uma Visualizacao de um Gafanhot e outro video
        System.out.println(linhaHifen);
        vs[1] = new Visualizacao(g[0],v[1]);
        System.out.println("Instanciando uma visualizacao de outro Gafanhoto e o mesmo video");
        System.out.println(vs[1].toString());
        System.out.println(linhaHifen);

        //Instanciando uma Visualizacao de um Gafanhot e outro video e avaliando
        System.out.println(linhaHifen);
        vs[1] = new Visualizacao(g[0],v[1]);
        System.out.println("Instanciando uma visualizacao de outro Gafanhoto e o mesmo video e avaliando");
        //vs[1].avaliar();
        System.out.println(vs[1].toString());
        System.out.println(linhaHifen);

















    }
}
