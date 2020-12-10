import java.util.*

class Matricula(var aluno: Aluno, var curso: Curso, var dataMatricula: Date) {
     init {
         println("O Aluno ${aluno.nome} ${aluno.sobrenome} foi matriculado com sucesso.")
         println("Data da matricula: $dataMatricula")
         println("Curso: $curso")
     }
}