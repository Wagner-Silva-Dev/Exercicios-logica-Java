// Um laboratório recebe amostras e quer a média do tempo por amostra
package fundamentos.lacosrepeticao;

import java.util.Scanner;

public class Laboratorio{
    public static void main(String []args){
        
        Scanner leia = new Scanner(System.in);
        
        double somaTempo = 0.0;
        int amostras;
        
        System.out.println("Digite a quantidade de amostras");
        amostras = leia.nextInt();

        while (amostras <= 0){
            System.out.print("Valor Invalido. Digite Novamente: ");
            amostras = leia.nextInt();
        }

        for (int i = 1; i <= amostras; i++){
            System.out.println("qual foi o tempo da " + i + "º amostra(Minutos)");
            double tempo = leia.nextDouble();

            while (tempo < 0){
                System.out.print("Tempo Invalido. Digite Novamente: ");
                tempo = leia.nextDouble();
            }        

            somaTempo += tempo;
        }
    double media = somaTempo / amostras;

    System.out.println("Tempo Medio (Min): " + String.format("%.2f", media));

    leia.close();
    }


}
