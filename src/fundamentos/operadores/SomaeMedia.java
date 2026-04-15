// Aprendendo a fazer a média de uma soma que o usuário digitar
package src.fundamentos.operadores;
import java.util.Scanner;

public class SomaeMedia 
    { 
    public static void main (String []args)
    {
        Scanner entrada = new Scanner(System.in);
        double A, B,media, soma;
        System.out.println("Digite o primeiro número:");
        A = entrada.nextDouble();
        System.out.println("Digite o segundo número:");
        B = entrada.nextDouble();
        soma = A + B;
        media = soma / 4;
        System.out.println("A soma de A e B é " + soma);
        System.out.println("A média de A e B é " + media);
        entrada.close();
    }
    
    }
