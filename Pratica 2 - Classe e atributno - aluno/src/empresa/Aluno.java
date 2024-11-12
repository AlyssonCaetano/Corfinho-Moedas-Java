package empresa;

public class Aluno {
	String nome;
	String curso;
	Avaliacao notas;
	
	
	
	public Aluno(String nome, String curso, Avaliacao notas) {
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}



	void info() {
		System.out.print("Nome: " + nome);
		System.out.print("Curso: " + curso);
		System.out.print("Media A: " + notas.mediaAritmetica());
		System.out.print("Media P: " + notas.mediaPonderada());
	}
	
}
