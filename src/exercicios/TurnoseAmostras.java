// Crie um programa que repete turnos e amostras, e permite interromper quando um valor especial for digitado (-1 encerra o turno).
package src.exercicios;

import java.util.Scanner;

public class TurnoseAmostras {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Qual a quantidade de amostras por turno?(ou -1 para encerrar)");
            int amostras = scanner.nextInt();

            if (amostras == -1){
                break;
            }
            
            while (amostras < 0){
                System.out.println("Valor Negativo não são válidos, Digite um Valor válido");
                amostras = scanner.nextInt();
            }

            for (int turno = 1; turno <= amostras; turno++){
                System.out.println("Digite o tempo para fazer essa amostra(ou -1 para encerrar)");
                double tempoAmostra = scanner.nextDouble();

                if (tempoAmostra == -1){
                    break;
                }

                while (tempoAmostra < 0){
                    System.out.println("Valor Negativo não são válidos, Digite um Valor válido");
                    tempoAmostra = scanner.nextInt();
                }

            }
            
        } while (true);
        
    scanner.close();
    }
}