// Enunciado 
// Implementando uma regra simples de desconto de uma loja.
// A regra é:

// Se o cliente for “premium” e o valor da compra for maior ou igual a 200, aplicar 15% de desconto.
// Se o cliente não for premium e o valor da compra for maior ou igual a 200, aplicar 5% de desconto.
// Se o valor da compra for menor que 200, não aplicar desconto.
package src.exercicios;
import java.util.Scanner;

public class CalculadoraDeDesconto
{
    public static String lerSN(Scanner entrada) 
    {
        String Continuar = entrada.next();

        while (!Continuar.equalsIgnoreCase("S") && !Continuar.equalsIgnoreCase("N"))
        {
            System.out.println("Texto inválido, Apenas S(Sim) ou N(Não) para continuar");
            Continuar = entrada.next();
        }
        return Continuar;
    }
    public static void main (String []args)
    {
    
    Scanner entrada = new Scanner(System.in);

    String Continuar = "S";

    while(Continuar.equalsIgnoreCase("S"))
    {   
        double ValorCompra, ValorFinal, ValorDesconto = 0, PorcentagemDesconto = 0;
        String Premium;

        System.out.println("Qual o valor da compra?");
        ValorCompra = entrada.nextDouble();
        ValorFinal = ValorCompra;
        
        if (ValorCompra >= 200) 
        {
            System.out.println("é um cliente premium? S/N");
            Premium = lerSN(entrada);

            if (Premium.equalsIgnoreCase("S"))
            {
                ValorDesconto = ValorCompra * 0.15;
            }
            else
            {
                ValorDesconto = ValorCompra * 0.05;
            }
            PorcentagemDesconto = (ValorDesconto / ValorCompra) * 100;
            ValorFinal = ValorCompra - ValorDesconto;
        }
    
        System.out.println("----------------------------------------");
        System.out.printf("O valor final da compra foi de R$ %.2f%n", ValorFinal);
        if (ValorCompra >= 200) {
            System.out.printf("O valor do desconto foi de R$ %.2f dando %.0f%% de desconto%n", ValorDesconto, PorcentagemDesconto);
        }
        System.out.println("----------------------------------------");

        System.out.println("Deseja continuar? S/N");
        Continuar = lerSN(entrada);            
    }

    entrada.close();

    }
}