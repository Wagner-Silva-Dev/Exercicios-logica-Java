/*Imagine que o sistema do hospital recebe o peso e a altura de pessoas em diferentes alas (PediatriaGeriatria e UTI). 
Se escrevermos a fórmula do IMC em cada parte do programateremos um código repetitivo e perigoso: se a fórmula mudar ou precisar de um ajuste
teríamos de alterar o código em dez lugares diferentes.*/
package exercicios;

import java.util.Scanner;

public class CalculadoraImcComMetodo {

    static String hospital = "Hospital Vila Esperanca";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBem vindo ao " + hospital);

        System.out.println("\nqual a ala que deseja consultar?");

        System.out.println("1 - Pediatria");
        System.out.println("2 - Geriatria");
        System.out.println("3 - UTI");

        int alaEscolha = scanner.nextInt();

        alaEscolhida(alaEscolha);

        calculoIMC(scanner);

        scanner.close();
    }

    public static int alaEscolhida(int escolha) {
        switch (escolha) {
            case 1:
                System.out.println("Bem vindo a área de Pediatria\n");
                break;

            case 2:
                System.out.println("Bem vindo a área de Geriatria\n");
                break;

            default:
                System.out.println("Bem vindo a área da UTI\n");
                break;
        }

        System.out.println("Vamos calcular seu IMC");

        return escolha;
    }

    public static double calculoIMC(Scanner scanner) {
        System.out.println("Digite qual o seu peso");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura(m)");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25){
            classificacao = "Peso normal";
        } else if (imc < 30){
            classificacao = "Sobrepeso";
        } else if (imc < 35){
            classificacao = "Obesidade Grau I";
        } else if (imc < 40){
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obesidade Grau III (Mórbida)";
        }

        System.out.printf("%n Você tem %.2fKg e %.2fm sendo assim você tem um IMC de %.2f - %s", peso, altura, imc, classificacao);

        return imc;
    }

}