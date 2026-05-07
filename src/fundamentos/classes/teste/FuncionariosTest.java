package fundamentos.classes.teste;

import fundamentos.classes.funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionariosTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Funcionario> funcionarios = new ArrayList<>(); //Lista que armazena os objetos Funcionario

            System.out.println("Quantos funcionários deseja cadastrar?");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < quantidade; i++) {
                System.out.println("Digite o nome do funcionario : ");
                String nome = scanner.nextLine();

                System.out.println("Digite a idade do funcionario : ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o salario do Funcionario : ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                Funcionario funcionario = new Funcionario(nome, idade, salario); // Cria um objeto Funcionario com os dados digitados
                funcionarios.add(funcionario); //Adiciona o objeto na lista
            }

            for (Funcionario funcionario : funcionarios) { //Mostra as informações que temos em mémoria
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Idade: " + funcionario.getIdade());
                System.out.printf("Salário: %.2f%n", funcionario.getSalario());
                System.out.println("----------------------------");
            }

            double soma = 0;
            for (Funcionario funcionario : funcionarios) { //Percorre a lista para somar os salários
                soma += funcionario.getSalario();
            }
            double media = soma / funcionarios.size();
            System.out.printf("A média dos salarios é de %.2f", media);
        }
    }
}