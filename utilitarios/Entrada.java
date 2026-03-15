package utilitarios;

import java.util.Scanner;

public class Entrada 
{
        public static String lerSN(Scanner entrada)
    {
        
        entrada.nextLine();
        System.out.println("Deseja continuar? S/N");
        String Continuar = entrada.nextLine();

        while (!Continuar.equalsIgnoreCase("S") && !Continuar.equalsIgnoreCase("N"))
        {
            System.out.println("Texto inválido, Apenas S(Sim) ou N(Não) para continuar");
            Continuar = entrada.next();
        }
        return Continuar;
    }    
}
