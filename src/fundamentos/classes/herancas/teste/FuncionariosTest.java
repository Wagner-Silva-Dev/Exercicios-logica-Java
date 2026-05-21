package fundamentos.classes.herancas.teste;

import fundamentos.classes.herancas.Funcionario;
import fundamentos.classes.herancas.Pessoa;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionariosTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Funcionario> funcionarios = new ArrayList<>();
            List<Pessoa> pessoas = new ArrayList<>();

            int opcao;
            do {
                System.out.println("------------");
                System.out.println("Digite 1 para cadastrar funcionarios");
                System.out.println("Digite 2 para cadastrar pessoas");
                System.out.println("Digite 3 para finalizar e mostrar os cadastros");

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Digite o nome do funcionario: ");
                        String nome = scanner.nextLine();

                        System.out.println("Digite a idade  do Funcionario: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o CPF do funcionario: ");
                        String cpf = scanner.nextLine();

                        System.out.println("Digite o salario do funcionario: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();

                        funcionarios.add(new Funcionario(nome, idade, cpf, salario));
                    }
                    case 2 -> {
                        System.out.println("Digite o nome da pessoa: ");
                        String nome = scanner.nextLine();

                        System.out.println("Digite a idade da pessoa: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o CPF da pessoa: ");
                        String cpf = scanner.nextLine();
                        pessoas.add(new Pessoa(nome, idade, cpf));
                    }
                    case 3 -> {
                        if (!funcionarios.isEmpty()) {
                            System.out.println("---Funcionarios---");
                            for (Funcionario funcionario : funcionarios) {
                                funcionario.imprimir();
                            }
                        } else {
                            System.out.println("Nenhum funcionario cadastrado");
                        }

                        if (!pessoas.isEmpty()) {
                            System.out.println("---Pessoas---");
                            for (Pessoa pessoa : pessoas) {
                                pessoa.imprimir();
                            }
                        } else {
                            System.out.println("Nenhum pessoa cadastrada");
                        }
                    }
                    default -> System.out.println("Opção invalida, tente novamente");
                }
            } while (opcao != 3);
        }
    }
}