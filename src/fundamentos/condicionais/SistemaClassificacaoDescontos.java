// Regras de Negócio:

// Compras a partir de R$ 500,00: Desconto de 20%.
// Compras entre R$ 200,00 e R$ 499,99: Desconto de 10%.
// Compras abaixo de R$ 200,00: Sem desconto (0%).

package src.fundamentos.condicionais;

import java.util.Scanner;
import src.utilitarios.*;

public class SistemaClassificacaoDescontos 
{
    public static void main(String []args)
    {
        Scanner leia = new Scanner(System.in);
        double compra;
        String continuar = "S";
        while (continuar.equalsIgnoreCase("S"))
        {     
        System.out.println("Qual é o valor da compra?");
        compra = leia.nextDouble();

        if (compra >= 500.00)
        {
            compra = compra * 0.8;
        }
        else if (compra >= 200) 
        {
            compra = compra * 0.9;
        }

        System.out.printf("Sua compra foi de %.2f %n", compra);
        continuar = Entrada.lerSN(leia);
        }
        leia.close();
    }
}