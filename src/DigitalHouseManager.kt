class DigitalHouseManager() {
    var listaAlunos = mutableListOf<Aluno>();
    var listaProfessores = mutableListOf<Professor>();
    var listaCursos = mutableListOf<Curso>()
    var listaMatriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        var cursoNome = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        listaCursos.add(cursoNome)
    }

    fun excluirCurso(codigoCurso: Int) {
        listaCursos.removeAt(codigoCurso)
    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        tempoDeCasa: Int
    ) {

        var professorAdjunto = ProfessorAdjunto(nome, sobrenome, tempoDeCasa, codigoProfessor);
        listaProfessores.add(professorAdjunto)

    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        tempoDeCasa: Int
    ) {

        var professorTitular = ProfessorTitular(nome, sobrenome, tempoDeCasa, codigoProfessor);
        listaProfessores.add(professorTitular)

    }

    //acho que está errado, mas não sei como fazer o professor ser excluído pelo código
    fun exlcuirProfessor(codigoProfessor: Int) {
        if (codigoProfessor == codigoProfessor)
            listaProfessores.removeAt(codigoProfessor)
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        var aluno = Aluno(nome, sobrenome, codigoAluno);
        listaAlunos.add(aluno)
    }
}

