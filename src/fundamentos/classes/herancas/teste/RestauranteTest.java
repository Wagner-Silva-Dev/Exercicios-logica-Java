package fundamentos.classes.herancas.teste;

import fundamentos.classes.herancas.restaurante.Garcom;

import java.util.Scanner;

public class RestauranteTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Garcom garcom = new Garcom("Leonardo", "213.542.532-43", 10);

            System.out.println(garcom.getNome() + " - Qual o número da mesa que deseja se sentar?");
            garcom.setNumeroMesa(scanner.nextInt());

            System.out.println("se alimentando...");

            System.out.print(garcom.getNome() + " - a conta deu um valor de ");
            double valorConta = scanner.nextDouble();

            double gorjeta = garcom.calcularGorjeta(valorConta);
            System.out.printf("%s - Total da conta da mesa %d foi de R$ %.2f, gerando uma gorjeta de R$ %.2f%n",
                    garcom.getNome(),
                    garcom.getNumeroMesa(),
                    valorConta,
                    gorjeta);
        }
    }
}
