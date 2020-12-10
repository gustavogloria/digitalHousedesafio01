abstract class Professor(
    var nome: String, var sobrenome: String, var tempoDeCasa: Int,
    var codigoProfessor: Int
) {

    override fun equals(other: Any?): Boolean {
        if (other is Professor) {
            return codigoProfessor == other.codigoProfessor
        }
        return false
    }

}