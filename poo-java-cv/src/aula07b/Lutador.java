package aula07b;

public class Lutador {
    //ATRIBUTOS:
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //CONSTRUCTOR:
    public Lutador(String no, String na, int id, double al, double pe,
                   int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    //GETTERS E SETTERES
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        //setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
        if (getPeso() < 52.2){
            setCategoria("Invalido");
        } else if (getPeso() <= 70.3) {
            setCategoria("Leve");
        } else if (getPeso() <= 83.9) {
            setCategoria("Medio");
        } else if (getPeso() < 120.2) {
            setCategoria("Pesado");
        }else {
            setCategoria("Invalido");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //METODOS:
    public void apresentar(){

    }
    public void status(){

    }
    public void ganharLuta(){

    }
    public void perderLuta(){

    }
    public void empatarLuta(){

    }
}
