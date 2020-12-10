class Curso(var nome: String, var codigoCurso: Int, var vagasDisponiveis: Int, var quantidadeMaximaAlunos: Int) {

    var alunosMatriculados = mutableListOf<Aluno>()
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null

    override fun equals(other: Any?): Boolean {
        if (other is Curso) {
            return codigoCurso == other.codigoCurso
        }
        return false
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (alunosMatriculados.size < quantidadeMaximaAlunos) {
            println("Não foi possível adicionar o aluno. Todas vagas preenchidas")
            return false
        }
        if (alunosMatriculados.contains(umAluno)) {
            println("Aluno já matriculado.")
            return false
        }
        alunosMatriculados.add(umAluno)
        return true
    }

    fun excluirAluno(umAluno: Aluno) {
        alunosMatriculados.remove(umAluno);
        println("Aluno excluído.")
    }
}