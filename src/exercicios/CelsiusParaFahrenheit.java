// Enunciado
// Crie um programa Java que leia uma temperatura em Celsius e mostre a temperatura em Fahrenheit.
// Fórmula: F = C * 9/5 + 32.
package src.exercicios;

import java.util.Scanner;
import java.util.Locale;
import src.utilitarios.*;

public class CelsiusParaFahrenheit
{
    public static void main(String []args)
    {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S"))
        {
            double celsius, fahrenheit;

            System.out.println("-------------------------------------");
            System.out.println("Conversor de Celsius para Fahrenheit");
            System.out.println("-------------------------------------");

            System.out.println("Qual a temperatura que gostaria de converter?");
            celsius = leia.nextInt();

            fahrenheit = celsius * 9/5 + 32;

            System.out.printf("Temperatura em Fahrenheit: %.2f\n", fahrenheit);
            
            continuar = Entrada.lerSN(leia);
        }
        leia.close();
    }
}