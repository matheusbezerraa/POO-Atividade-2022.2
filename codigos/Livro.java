
package bibliotecaq5;


public class Livro {
        private String nomeLivro;
	private int quantidadePaginas;
	private String autor;
	private String editora;
	private int numSerie;
	
	public Livro() {
	}
	
	public Livro(String nomeLivro, int quantidadePaginas, String autor, String editora, int numSerie) {
		super();
		this.nomeLivro = nomeLivro;
		this.quantidadePaginas = quantidadePaginas;
		this.autor = autor;
		this.editora = editora;
		this.numSerie = numSerie;
	}

    Livro(String nomeLivro, String autor, int quantidadePaginas, String editora, int numSerie) {
        }

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	   
}
