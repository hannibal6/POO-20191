public class Turma {
	private Professor professores = Professor[];
	private Aluno alunos = Aluno[];
	private String codigoTurma;
	private String nomeTurma;
    private String sala;
	private String horario;
	private String tipo;

	Turma(String codigoTurma, String nomeTurma, String sala, String horario, String tipo) {
		this.codigoTurma = codigoTurma;
		this.nomeTurma = nomeTurma;
		this.sala = sala;
		this.horario = horario;
		this.tipo = tipo;
	}

	public void listaAlunos() {
		for (Aluno a: alunos) {
			System.out.println(a.nome);
		}
	}

	public void notaAlunos() {
		for (Aluno a: alunos) {
			System.out.println(a.nome + ": " + a.getNota());
		}
	}
}