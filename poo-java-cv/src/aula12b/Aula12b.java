package aula12b;

public class Aula12b {
    public static void main(String[] args){
        int tamanhoLinha = 50;
        String linhaHifen = "-".repeat(tamanhoLinha);

        //Instanciando a classe Mamifero (Filha - especialização da classe Animal)
        //diferença para a classe Animal: atributo corPelo
        Mamifero m = new Mamifero();
        m.setPeso(15.4);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Branco");
        System.out.println(linhaHifen);
        System.out.println("Informacoes sobre o mamifero:");
        System.out.println("Peso: " + m.getPeso());
        System.out.println("Idade: " + m.getIdade());
        System.out.println("Membros: " + m.getMembros());
        System.out.println("Cor do pelo: " + m.getCorPelo());
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println(linhaHifen);

        //Instanciando a classe Reptil (Filha - especialização da classe Animal)
        //diferença para a classe Animal: atributo corEscama
        Reptil r = new Reptil();
        r.setPeso(1.78);
        r.setIdade(2);
        r.setMembros(4);
        r.setCorEscama("Verde");
        System.out.println(linhaHifen);
        System.out.println("Informacoes sobre o reptil:");
        System.out.println("Peso: " + r.getPeso());
        System.out.println("Idade: " + r.getIdade());
        System.out.println("Membros: " + r.getMembros());
        System.out.println("Cor da escama: " + r.getCorEscama());
        r.locomover();
        r.alimentar();
        r.emitirSom();
        System.out.println(linhaHifen);

        //Instanciando a classe Peixe (Filha - especialização da classe Animal)
        //diferença para a classe Animal: atirbuto corEscama
        //
        Peixe p = new Peixe();
        p.setPeso(0.845);
        p.setIdade(1);
        p.setMembros(0);
        p.setCorEscama("Cinza");
        System.out.println(linhaHifen);
        System.out.println("Informacoes sobre o peixe:");
        System.out.println("Peso: " + p.getPeso());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Membros: " + p.getMembros());
        System.out.println("Cor da escama: " + p.getCorEscama());
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        System.out.println(linhaHifen);

        //Instanciando a classe Ave (Filha - especialização da classe Animal)
        Ave a = new Ave();
        a.setPeso(3.74);
        a.setIdade(5);
        a.setMembros(2);
        a.setCorPena("Branca");
        System.out.println(linhaHifen);
        System.out.println("Informações sobre a ave:");
        System.out.println("Peso: " + a.getPeso());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Membros: " + a.getMembros());
        System.out.println("Cor da pena: " + a.getCorPena());
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println(linhaHifen);

        //Instanciando a classe Canguru (Filha - especialização da classe Mamifero)






    }
}
