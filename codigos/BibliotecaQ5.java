
package bibliotecaq5;
import java.util.Scanner;
import java.util.Date;
        
import bibliotecaq5.Pessoa;
import bibliotecaq5.Livro;
import bibliotecaq5.Emprestimo;
        
public class BibliotecaQ5 {
    

    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe seus dados: ");
        
        System.out.print("Número da matrícula:");
        int numMatricula = sc.nextInt();
        
        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        
        System.out.print("CPF: ");
        Long cpf = sc.nextLong(); 
        
       Pessoa pessoa = new Pessoa(numMatricula, nome, curso, cpf);
        
        System.out.println();
        
        System.out.println("Informe o livro a ser alugado: ");
         System.out.print("Nome do livro: ");
         sc.nextLine();
          String nomeLivro = sc.nextLine();     
          
          System.out.print("Número de páginas ");
         int quantidadePaginas = sc.nextInt();
         
         System.out.print("Autor: ");
         sc.nextLine();
          String autor = sc.nextLine();
        
       
        System.out.print("Editora: ");
        String editora = sc.nextLine();
        
        System.out.print("Número de série:");
        int numSerie = sc.nextInt();
                
       Livro livro= new Livro(nomeLivro, quantidadePaginas, autor, editora, numSerie); 
        
        Date data = new Date();
        
        Emprestimo emprestimo = new Emprestimo (pessoa, livro, data);
        
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println(emprestimo);
       
        
        sc.close();
        }
    
    
}
