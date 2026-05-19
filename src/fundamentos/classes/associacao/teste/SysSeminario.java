package fundamentos.classes.associacao.teste;

import fundamentos.classes.associacao.seminario.Aluno;
import fundamentos.classes.associacao.seminario.Local;
import fundamentos.classes.associacao.seminario.Professor;
import fundamentos.classes.associacao.seminario.Seminario;

public class SysSeminario {
    public static void main(String[] args) {
        Local local = new Local("rua das macaxeiras");
        Aluno aluno = new Aluno("Arnold", 18);
        Professor professor = new Professor("Ironildo", "Inovação e Tendências");

        Aluno[] alunosSeminario = {aluno};

        Seminario seminario = new Seminario("Tecnologia e Transformação Digital", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminario(seminariosDisponiveis);

        professor.imprime();
    }
}
