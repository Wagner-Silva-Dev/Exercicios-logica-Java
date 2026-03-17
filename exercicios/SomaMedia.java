// Enunciado
// Crie um programa Java que leia três notas (double) e calcule a média simples.
// Depois imprima “media final” com duas casas decimais.
package exercicios;

import java.util.Scanner;
import utilitarios.*;

public class SomaMedia 
{
    public static void main(String []args)
    {
        Scanner leia = new Scanner(System.in);
        
        
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) 
        {
            double n1, n2 , n3, mediaFinal;

            System.out.println("Calculadora de Média Final%n");

            System.out.println("Qual a primeira nota?");
            n1 = leia.nextDouble();

            System.out.println("Qual a segunda nota?");
            n2 = leia.nextDouble();

            System.out.println("Qual a terceira nota?");
            n3 = leia.nextDouble();

            mediaFinal = (n1 + n2 + n3) / 3;

            System.out.printf("A média final foi de %.2f %n", mediaFinal);

            continuar = Entrada.lerSN(leia);
        }
        
        leia.close();
    }    
}