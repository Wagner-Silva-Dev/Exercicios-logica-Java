package fundamentos.classes.teste;

import fundamentos.classes.funcionarios.ImprimirFuncionarios;
import fundamentos.classes.funcionarios.Funcionarios;

import java.util.Scanner;

public class FuncionariosTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Funcionarios funcionarios = new Funcionarios();
        ImprimirFuncionarios exibirFuncionarios = new ImprimirFuncionarios();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do funcionario : ");
            funcionarios.nomes[i] = scanner.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a idade do funcionario : ");
            funcionarios.idades[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o salario do Funcionario : ");
            funcionarios.salarios[i] = scanner.nextDouble();
        }
        exibirFuncionarios.imprimir(funcionarios);
        exibirFuncionarios.imprimirMedia(funcionarios);
    }
}