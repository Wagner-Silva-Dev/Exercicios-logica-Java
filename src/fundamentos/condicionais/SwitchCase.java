package fundamentos.condicionais;

import java.util.Scanner;

import  utilitarios.Entrada;

public class SwitchCase 
{
    public static void main(String []args)    
    {
        Scanner leia = new Scanner(System.in);
        int escolha;
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S"))
        {
            System.out.println("Qual departamento deseja acionar?");
            System.out.println("1 - Emergência");
            System.out.println("2 - Agendar Consulta");
            System.out.println("3 - Retirada de Exames");
            escolha = leia.nextInt();

            switch (escolha)
            {
                case 1:
                    System.out.println("Encaminhando para Emergência");
                break;

                case 2:
                    System.out.println("Agendando Consulta");
                break;

                case 3:
                    System.out.println("Preparando Retirada de Exames");
                break;
                
                default:
                    System.out.println("Por favor digite um número de 1 a 3 para escolher");
                break;
            }
            
            continuar = Entrada.lerSN(leia);
        }
        leia.close();
    }
}
