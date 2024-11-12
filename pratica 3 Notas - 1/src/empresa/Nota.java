package empresa;

public class Nota {
	private double nota1;
	private double nota2;
	private int faltas;
	
	public void setNota1(double nota) {
		if(nota<0 || nota > 10) {
			System.out.println("Nota inválida");
			return;
		}
		nota1 = nota;
	}
	
	public void setNota2(double nota) {
		if(nota<0 || nota > 10) {
			System.out.println("Nota inválida");
			return;
		}
		nota2 = nota;
	}
	
	
	
	
	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		if(faltas>40 || faltas < 0) {
			System.out.println("Numero de faltas invalido");
		}
		this.faltas = faltas;
	}

	double getNota1() {
		return nota1;
	}
	
	double getNota2() {
		return nota2;
	}
	
	
	void resultado() {
		
		
		double media = (nota1 + nota2)/2;
		System.out.println("Media: " + media);
		
		if(faltas>7) {
			System.out.println("Reprovado por falta");
		}
		
		else if(media < 4) {
			System.out.println("Reprovado");
		}
		else if(media <7) {
			System.out.println("Exame final");
		}
		
		else {
			System.out.println("Aprovado");
		}
		
		

	}

	
}
