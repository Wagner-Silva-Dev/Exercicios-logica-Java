package fundamentos.classes.teste;

import fundamentos.classes.sobrecarga.calculadora.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSobrecargaTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Calculadora calculadora = new Calculadora();

        try(Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Deseja trabalhar com números inteiros ou decimais? (int ou dec) ");
                String opcao = scanner.next();
                if (opcao.equalsIgnoreCase("int")) {
                    int resultado = somarInteiros(scanner, calculadora);
                    System.out.println("Resultado da soma é de " + resultado);
                    break;
                } else if (opcao.equalsIgnoreCase("dec")) {
                    double resultado = somarDecimais(scanner, calculadora);
                    System.out.println("Resultado da soma é de " + resultado);
                    break;
                } else {
                    System.out.println("Opção inválida, digite (int ou dec)");
                }
            } while (true);
        }
    }
    static int somarInteiros(Scanner scanner, Calculadora calculadora) {
        System.out.println("Deseja somar quantos numeros? 2 ou 3");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o primeiro valor: ");
        int primeiroValor = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int segundoValor = scanner.nextInt();

        if (opcao == 3) {
            System.out.println("Digite o terceiro valor: ");
            int terceiroValor = scanner.nextInt();
            return calculadora.somar(primeiroValor, segundoValor,terceiroValor);
        }
        return calculadora.somar(primeiroValor, segundoValor);
    }

    static double somarDecimais(Scanner scanner, Calculadora calculadora) {
        System.out.println("Digite o primeiro valor: ");
        double primeiroValor = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double segundoValor = scanner.nextDouble();

        return calculadora.somar(primeiroValor, segundoValor);
    }
}