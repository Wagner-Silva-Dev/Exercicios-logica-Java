package fundamentos.condicionais;

import java.util.Scanner;

public class TaxaSalarioAnualHolanda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu salário?");
        double salario = input.nextDouble();

        while (salario < 0) {
            System.out.println("Valores negativos não são válidos, digite novamente.");
            salario = input.nextDouble();
        }

        double valorImposto;

        if (salario >= 0 && salario <= 34712) {
            valorImposto = (salario * 0.097);
        } else if (salario >= 34713 && salario <= 68507) {
            valorImposto = (salario * 0.3735);
        } else {
            valorImposto = (salario * 0.4950);
        }

        double salarioComDesconto = salario - valorImposto;

        System.out.printf("Seu salario bruto é de €%.2f, com a taxa de imposto de €%.2f sobra €%.2f", salario , valorImposto, salarioComDesconto);
    }
}
