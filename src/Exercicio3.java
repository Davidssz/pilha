import java.util.Stack;

public class Exercicio3 {
    private String nome;
    private String autor;
    private int isbn;
    private int ano;

    public Exercicio3(String nome, String autor, int isbn, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano: " + ano);
        System.out.println("");
    }

    public static void main(String[] args) {
        Stack<Exercicio3> pilhaLivros = new Stack<>();

        pilhaLivros.push(new Exercicio3("Chapeuzinho Vermelho", "Chico coins", 6666666, 2023));
        pilhaLivros.push(new Exercicio3("Cinderela", "BlindFrog", 123456789, 2000));
     

    
        System.out.println("Atributos dos livros na pilha:");
        for (Exercicio3 livro : pilhaLivros) {
            livro.imprimir();
        }

        // Mostrando a quantidade de livros na pilha
        System.out.println("Quantidade de livros na pilha: " + pilhaLivros.size());
    }
}