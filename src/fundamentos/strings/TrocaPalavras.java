package src.fundamentos.strings;
import java.util.Scanner;

public class TrocaPalavras {
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
        public static void main(String args[])
        {
            Scanner leia = new Scanner(System.in);
            String Continuar = "S";

            while(Continuar.equalsIgnoreCase("S"))
            { 
                String texto, troca, novo;
                
                System.out.println("Qual o texto?");
                texto = leia.nextLine();
                
                System.out.println("Deseja trocar qual parte do texto?");
                troca = leia.nextLine();

                System.out.println("Por qual palavra?");
                novo = leia.nextLine();

                texto = texto.replace(troca, novo);
                System.out.println(texto);
                
                System.out.println("Deseja continuar? S/N");
                Continuar = lerSN(leia);
                leia.nextLine();
            }
            leia.close();            
        }
}
