import java.util.Scanner;

public class Aluno {
    private String nome;
	private String matricula;
	private String dataNascimento;
	private String nomeMae;
	private double nota;
	
	Aluno(String nome, String matricula, String dataNascimento, String nomeMae) {
		this.nome = nome;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
		this.nomeMae = nomeMae;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getNota() {
		return nota;
	}
}