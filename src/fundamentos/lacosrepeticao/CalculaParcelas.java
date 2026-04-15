package src.fundamentos.lacosrepeticao;

import java.util.Scanner;

public class CalculaParcelas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total: ");
        double total = scanner.nextDouble();

        for (int parcelas = 1; parcelas <= total; parcelas ++) {
            double valorParcelas = total / parcelas;

            if (valorParcelas < 1000){
                break;
            }

            System.out.println(parcelas + " parcelas de R$ " + valorParcelas);
        }
        scanner.close();
    }
}