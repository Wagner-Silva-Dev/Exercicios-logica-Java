package fundamentos.lacosrepeticao;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja ver os númeoros pares e ímpares até que número? ");
        int limite = scanner.nextInt();

        for (int i = 0; i <= limite; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " Par, ");
            }
            else {
                System.out.print(i + " Impar, ");
            }
        }
        scanner.close();
    }
}