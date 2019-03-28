public class Professor {
	private String nomeProfessor;
	private String matricula;
    private String grauInstrucao;
	private double salarioBase;
	private Aluno alunos = Aluno[];

	Professor(String nomeProfessor, String matricula, String grauInstrucao, double salarioBase) {
		this.nomeProfessor = nomeProfessor;
		this.matricula = matricula;
		this.grauInstrucao = grauInstrucao;
		this.salarioBase = salarioBase;
	}

	public void listaAlunos() {
		for (Aluno a: alunos) {
			System.out.println(a.nome);
		}
	}
}