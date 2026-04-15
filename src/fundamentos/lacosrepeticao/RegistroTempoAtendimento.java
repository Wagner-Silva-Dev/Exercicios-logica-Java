// Você está implementando um sistema de registro de tempos de atendimento. Ao final do dia, o gestor quer saber: total de atendimentos, 
// tempo total de atendimentos, tempo médio, maior tempo e menor tempo.
package src.fundamentos.lacosrepeticao;

import java.util.Scanner;
import java.util.Locale;

public class RegistroTempoAtendimento {
    public static void main(String []args){
        
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        int atendimentos;
        double somaTempo = 0.0, maiorTempo = Double.NEGATIVE_INFINITY, menorTempo = Double.POSITIVE_INFINITY;

        System.out.println("Quantos atendimentos teve no dia?");
        atendimentos = leia.nextInt();

        while (atendimentos <= 0){
            System.out.println("Não pode ter 0 atendimentos no dia, digite novamente");
            atendimentos = leia.nextInt();
        }

        for (int i = 1; i <= atendimentos; i++){
            System.out.println("Digite o tempo do " + i +"º atendimento (Minutos)");
            double tempo = leia.nextDouble();

            while (tempo <0){
                System.out.print("Valor inválido, digite um número maior que zero: ");
                tempo = leia.nextDouble();
            }
            if (tempo > maiorTempo){
                maiorTempo = tempo;
            }

            if (tempo < menorTempo){
                menorTempo = tempo;
            }
            somaTempo += tempo;
        }

        double media = somaTempo / atendimentos;

        System.out.println("Total de Atendimentos: " + atendimentos);
        System.out.println("Tempo Total de Atendimentos: " + somaTempo);
        System.out.printf("Tempo Médio dos Atendimentos: %.2f %n", media);
        System.out.println("O Atendimento com maior tempo foi de: " + maiorTempo + " Minutos");
        System.out.println("O atendimento com menor tempo foi de: " + menorTempo + " Minutos");

        leia.close();
    }
    
}