package JavaBasico;
// Enunciado 
// Implementando uma regra simples de desconto de uma loja.
// A regra é:

// Se o cliente for “premium” e o valor da compra for maior ou igual a 200, aplicar 15% de desconto.
// Se o cliente não for premium e o valor da compra for maior ou igual a 200, aplicar 5% de desconto.
// Se o valor da compra for menor que 200, não aplicar desconto.
import java.util.Scanner;

public class Premiumounao 
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
        double ValorCompra, ValorFinal;
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
                ValorFinal = ValorCompra * 0.85;
            }   
            else
            {
                ValorFinal = ValorCompra * 0.95;
            }
        }
    
        System.out.println("----------------------------------------");
        System.out.println("O valor final da compra foi de " + ValorFinal);
        System.out.println("----------------------------------------");

        System.out.println("Deseja continuar? S/N");
        Continuar = lerSN(entrada);            
    }

    entrada.close();

    }
}