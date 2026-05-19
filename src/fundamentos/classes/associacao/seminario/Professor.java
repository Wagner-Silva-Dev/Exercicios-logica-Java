package fundamentos.classes.associacao.seminario;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminario == null) return;
        System.out.println("---Seminario cadastrados---");
        for (Seminario seminarios : this.seminario) {
            System.out.println(seminarios.getTitulo());
            System.out.println(seminarios.getLocal().getEndereco());
            if ((seminarios.getAlunos() == null) || seminarios.getAlunos().length == 0) continue;
            System.out.println("---Alunos---");
            for (Aluno alunos : seminarios.getAlunos()) {
                System.out.println("Aluno: " + alunos.getNome() + " Idade: " + alunos.getIdade());
            }
        }
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
