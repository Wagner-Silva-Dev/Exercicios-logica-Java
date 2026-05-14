package fundamentos.classes.exercicios.seminario;

import java.util.ArrayList;
import java.util.List;

public class Seminario {
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();
    private String titulo;
    private Local local;

    public Seminario(Professor professor, Aluno aluno) {
        this.professor = professor;
        this.alunos.add(aluno);
    }
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
