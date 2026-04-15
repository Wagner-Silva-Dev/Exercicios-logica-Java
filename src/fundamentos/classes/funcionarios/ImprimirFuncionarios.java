package src.fundamentos.classes.funcionarios;

public class ImprimirFuncionarios {
    public void imprimir(Funcionarios funcionarios) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Funcionario " + (i + 1) + ":");
            System.out.println("Nome: " + funcionarios.nomes[i]);
            System.out.println("Idade: " + funcionarios.idades[i]);
            System.out.printf("Salario: %.2f\n", funcionarios.salarios[i]);
            System.out.println("----------------------------");
        }
    }
    public void imprimirMedia(Funcionarios funcionarios) {
        double soma = 0;
        for (int i = 0; i < funcionarios.salarios.length; i++) {
            soma += funcionarios.salarios[i];
        }
        double media = soma / funcionarios.salarios.length;
        System.out.printf("A média dos salarios é de %.2f", media);
    }
}
