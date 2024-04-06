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
        //diferença para a classe Animal: atirbuto corEscama e método soltarBolha()
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
        //diferança para a classe Animal: atributo corPena e método fazerNinho
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
        //diferença para classe Mamífero: métodos usarBolsa() e sobreposição do método locomover()
        Canguru ca = new Canguru();
        ca.setPeso(41.7);
        ca.setIdade(5);
        ca.setMembros(4);
        ca.setCorPelo("Marrom");
        System.out.println(linhaHifen);
        System.out.println("Informações sobre o canguru:");
        System.out.println("Peso: " + ca.getPeso());
        System.out.println("Idade: " + ca.getIdade());
        System.out.println("Membros: " + ca.getMembros());
        System.out.println("Cor do pelo: " + ca.getCorPelo());
        ca.locomover();
        ca.alimentar();
        ca.emitirSom();
        ca.usarBolsa();
        System.out.println(linhaHifen);

        //Instanciando a classe Cachorro(Filha - especialização da classe Mamifero)
        //diferença para classe Mamífero: métodos enterrarOsso() e abanarRabo()
        Cachorro cc = new Cachorro();
        cc.setPeso(15.3);
        cc.setIdade(1);
        cc.setMembros(4);
        cc.setCorPelo("Marrom, branco e preto.");
        System.out.println(linhaHifen);
        System.out.println("Informações sobre o cachorro:");
        System.out.println("Peso: " + cc.getPeso());
        System.out.println("Idade: " + cc.getIdade());
        System.out.println("Membros: " + cc.getMembros());
        System.out.println("Cor do pelo: " + cc.getCorPelo());
        cc.locomover();
        cc.alimentar();
        cc.emitirSom();
        cc.enterrarOsso();
        cc.abanarRabo();
        System.out.println(linhaHifen);

        //Instanciando a classe Cobra (Filha - especialização da classe Reptil)
        Reptil c = new Reptil();
        c.setPeso(2.87);
        c.setIdade(4);
        c.setMembros(0);
        c.setCorEscama("Cinza");
        System.out.println(linhaHifen);
        System.out.println("Informações sobre a cobra");
        System.out.println("Peso: " + c.getPeso());
        System.out.println("Idade: " + c.getIdade());
        System.out.println("Membros: " + c.getMembros());
        System.out.println("Cor da escama: " + c.getCorEscama());
        c.locomover();
        c.alimentar();
        c.emitirSom();

        //Instanciando a classe Tartaruga (Filha - especialização da classe Reptil)
        //diferença para a classe Reptil: sobreposição do método locomover()
        Tartaruga t = new Tartaruga();
        t.setPeso(5.8);
        t.setIdade(12);
        t.setMembros(4);
        t.setCorEscama("Marrom");
        System.out.println(linhaHifen);
        System.out.println("Informações sobre a tartaruga:");
        System.out.println("Peso: " + t.getPeso());
        System.out.println("Idade: " + t.getIdade());
        System.out.println("Membros: " + t.getMembros());
        System.out.println("Cor da escama: " + t.getCorEscama());
        t.locomover();
        t.alimentar();
        t.emitirSom();
        System.out.println(linhaHifen);

        //Instanciando a classe Goldfish (Filha - especialização da classe Peixe)
        Goldfish g = new Goldfish();
        g.setPeso(0.987);
        g.setIdade(1);
        g.setMembros(0);
        g.setCorEscama("Amarela");
        System.out.println(linhaHifen);
        System.out.println("Informações sobre o goldfish:");
        System.out.println("Peso: " + g.getPeso());
        System.out.println("Idade: " + g.getIdade());
        System.out.println("Membros: " + g.getMembros());
        System.out.println("Cor da escama: " + g.getCorEscama());
        g.locomover();
        g.alimentar();
        g.emitirSom();
        g.soltarBolha();
        System.out.println(linhaHifen);

        //Instanciando a classe Arara (Filha - especialização da classe Ave)
        Arara ar = new Arara();
        ar.setPeso(3.74);
        ar.setIdade(6);
        ar.setMembros(2);
        ar.setCorPena("Azul e amarelo");
        System.out.println(linhaHifen);
        System.out.println("Informações sobre a arara:");
        System.out.println("Peso: " + ar.getPeso());
        System.out.println("Idade: " + ar.getIdade());
        System.out.println("Membros: " + ar.getMembros());
        System.out.println("Cor da pena:  " + ar.getCorPena());
        ar.locomover();
        ar.alimentar();
        ar.emitirSom();
        ar.fazerNinho();
        System.out.println(linhaHifen);







    }
}
