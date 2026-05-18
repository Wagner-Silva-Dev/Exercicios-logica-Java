package exercicios;

import fundamentos.classes.exercicios.seminario.Aluno;
import fundamentos.classes.exercicios.seminario.Local;
import fundamentos.classes.exercicios.seminario.Professor;
import fundamentos.classes.exercicios.seminario.Seminario;

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
