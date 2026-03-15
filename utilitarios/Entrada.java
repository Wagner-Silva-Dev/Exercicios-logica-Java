package utilitarios;

import java.util.Scanner;

public class Entrada 
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
}
