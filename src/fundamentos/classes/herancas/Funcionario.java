package fundamentos.classes.herancas;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, int idade, String CPF, double salario) {
        super(nome, idade, CPF);
        this.salario = salario;
    }

    public void imprimir(){
        super.imprimir();
        System.out.printf("Salario: %.2f\n", this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}