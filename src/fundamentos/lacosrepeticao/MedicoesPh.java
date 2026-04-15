// Você está implementando um sistema que registra medições. Cada medição precisa obedecer a regras:
// A quantidade de amostras deve ser maior que zero.
// Um valor de pH deve estar entre 0 e 14.
// O operador pode digitar errado e precisa tentar novamente.
// Em algum momento, o operador deve conseguir encerrar a digitação quando terminar (sem o programa exigir um número fixo de entradas).
package src.fundamentos.lacosrepeticao;

import java.util.Scanner;

public class MedicoesPh {
    public static void main (String []args){

        Scanner leia = new Scanner(System.in);

        double pH = Double.NEGATIVE_INFINITY;
        int totalAmostras = 0;

        do {
            System.out.println("REGISTRO DE MEDIÇÕES");
            System.out.println("Digite o pH da amostra (ou -1 para encerrar):");
            pH = leia.nextDouble();

            if (pH == -1 && totalAmostras > 0) {
                break;
            } else if (pH == -1 && totalAmostras == 0) {
                System.out.println("Deve conter no mínimo uma amostra cadastrada");
            } else if (pH < 0 || pH > 14) {
                System.out.println("Valor inválido, digite um número entre 0 e 14:");
            } else {
                totalAmostras++;
                System.out.println("Medição cadastrada! Total: " + totalAmostras);
            }

        } while (true);

    System.out.println("Total de amostras registradas: " + totalAmostras);
    leia.close();
    }
}
