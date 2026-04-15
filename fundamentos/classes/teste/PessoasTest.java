package fundamentos.classes.teste;

import fundamentos.classes.pessoas.Pessoas;

import java.util.Scanner;

public class PessoasTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoas pessoas = new Pessoas();

        System.out.println("Digite seu nome: ");
        pessoas.setNome(scanner.nextLine());

        System.out.println("Digite sua idade: ");
        pessoas.setIdade(scanner.nextInt());
        pessoas.imprimir();
        System.out.println(pessoas.getNome());
    }
}