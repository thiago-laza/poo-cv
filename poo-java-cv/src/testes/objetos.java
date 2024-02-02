package testes;

public class objetos {
    public static void main(String[] args){
        //criando um objeto:
        ClassePrincipal obj1 = new ClassePrincipal();
        //instanciando a classe:
        obj1.nome = "Thiago";
        obj1.idade = 40;
        obj1.altura = 1.67f;
        obj1.peso = 68.6f;
        //chamando o metodo
        obj1.status();
    }
}
