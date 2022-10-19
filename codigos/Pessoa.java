
package bibliotecaq5;


public class Pessoa {
 private int numeroMatricula;
	private String nome;
	private String curso;
	private Long cpf;
	
	public Pessoa() {
		
	}

	public Pessoa(int numeroMatricula, String nome, String curso, Long cpf) {
		this.numeroMatricula = numeroMatricula;
		this.nome = nome;
		this.curso = curso;
		this.cpf = cpf;
	}

    Pessoa(String numMatricula, String nome, String curso, Long cpf) {
        }

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	   
}
