package aula09b;

public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Constructor


    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    //Metodos getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    //Metodos
    public void detalhes(){

        System.out.println("Detalhes do livro:");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de paginas: " + getTotPag());
        System.out.println("Pagina atual: " + getPagAtual());
        System.out.println("Aberto: " + getAberto());
        System.out.println("Detalhes do leitor:");
        System.out.println("Leitor: " + leitor.getNome());
        System.out.println("Idade: " + leitor.getIdade());
        System.out.println("Sexo: " + leitor.getSexo());
    }



    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPag){
            this.pagAtual = 0;
        }else {
            this.pagAtual = p;
        }

    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() - 1);
    }
}
