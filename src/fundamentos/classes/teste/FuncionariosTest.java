package fundamentos.classes.teste;

import fundamentos.classes.exerciciosAssociacao.funcionarios.Departamento;
import fundamentos.classes.exerciciosAssociacao.funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionariosTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Funcionario> funcionarios = new ArrayList<>(); //Lista que armazena os objetos Funcionario

            System.out.println("Quantos funcionários deseja cadastrar?");
            int Funcionarios = scanner.nextInt();

            System.out.println("Deseja cadastrar o departamento de quantos funcionarios?");
            int funcionariosDepartamento = scanner.nextInt();
            scanner.nextLine();

            int contador = 0;
            for (int i = 0; i < Funcionarios; i++) {
                System.out.println("Digite o nome do funcionario : ");
                String nome = scanner.nextLine();

                System.out.println("Digite a idade do funcionario : ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o salario do Funcionario : ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                if (funcionariosDepartamento != 0 && funcionariosDepartamento > contador) {
                    System.out.println("Digite o departamento do funcionario : ");
                    String nomeDepartamento = scanner.nextLine();
                    Departamento departamento = new Departamento(nomeDepartamento);
                    funcionarios.add(new Funcionario(nome, idade, salario, departamento));
                    contador += 1;
                } else {
                    funcionarios.add(new Funcionario(nome, idade, salario)); // Cria um objeto Funcionario com os dados digitados
                }
            }

            for (Funcionario funcionario : funcionarios) { //Mostra as informações que temos em mémoria
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Idade: " + funcionario.getIdade());
                System.out.printf("Salário: %.2f%n", funcionario.getSalario());
                if (funcionario.getDepartamento() != null) {
                    System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
                }
                System.out.println("----------------------------");
            }

            if (Funcionarios > 1) {
                double soma = 0;
                for (Funcionario funcionario : funcionarios) { //Percorre a lista para somar os salários
                    soma += funcionario.getSalario();
                }
                double media = soma / funcionarios.size();
                System.out.printf("A média dos %s salarios é de %.2f", Funcionarios, media);
            }
        }
    }
}