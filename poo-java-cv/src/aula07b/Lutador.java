package aula07b;

public class Lutador {
    //Atributos:
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    //constructor
    public Lutador(String nome, String nacionalidade,
                   int idade, double altura, double peso,
                   int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }
    
}
