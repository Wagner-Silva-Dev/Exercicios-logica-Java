// Implemente um programa que:
// 1. Leia tempos até o usuário digitar -1.
// 2. Ignore tempos negativos diferentes de -1.
// 3. Ao final, mostre soma, quantidade de válidos e média (se houver).
// 4. Mostre uma mensagem clara se nenhum valor válido foi informado.
package fundamentos.lacosrepeticao;

import java.util.Scanner;
import java.util.Locale;

public class RegistroTempo {
    public static void main(String []args){

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int cont = 0;
        double tempo, soma = 0.0;

        do{
            System.out.println("Digite o tempo (-1 para encerrar)");
            tempo = leia.nextDouble();

            if ((tempo == -1 && cont > 0) || (tempo == -1 && cont == 0)){
                break;
            }
            else if (tempo <= 0){
                System.out.println("Valores negativos não são aceitos");
            }
            else{
                cont++;
                System.out.println("Tempo de " + tempo + " minutos registrado com sucesso");
                soma += tempo;
            }
        }while (tempo != -1);

        if (tempo == -1 && cont == 0){
            System.out.println("Nenhum tempo válido foi informado");
        }
        else{
            System.out.println("Relatório Final");
            System.out.printf("Soma dos tempos cadastrados: %.2f\n", soma);
            System.out.println("Quantidade de cadastros válidos: " + cont);

            if (cont > 1){
                System.out.printf("Média dos valores cadastrados: %.2f\n", soma / cont);
            }
            
            System.out.println("\nRelatório encerrado");
        }
        
        leia.close();
    }
}