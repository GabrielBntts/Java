package AtividadeN1;

import java.util.Scanner;
public class Mainlivros {  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livros livros = new Livros();
        Editora editora = new Editora();
        
        System.out.println
        ("Digite o Código do livro: ");
        livros.codigo = ler.nextInt();
        System.out.println
        ("Título do livro: ");
        livros.tituloLivro = ler.next();
        System.out.println
        ("Digite o código da editora: ");
        editora.codigoEditora = ler.nextInt();
        System.out.println
        ("Razão Social: ");
        editora.razaoSocial = ler.next();
        System.out.println
        ("Digite o email da Editora: ");
        editora.email = ler.next();
        
        
        
        System.out.println("Livro cadastrado com sucesso");
        System.out.println("***");
        System.out.println("Título do livro: " + livros.tituloLivro);
        System.out.println("Codigo da editora: " + editora.codigoEditora);
        System.out.println("Codigo do livro: " + livros.codigo);
        System.out.println("Razão Socail da Editora: " + editora.razaoSocial);
        System.out.println("Email da editora: " + editora.email);
        
        
    }
    
}
