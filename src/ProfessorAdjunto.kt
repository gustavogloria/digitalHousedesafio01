class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigoProfessor: Int,
    var horasMonitoria: String
) :
    Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {
}