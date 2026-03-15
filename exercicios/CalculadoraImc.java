package exercicios;
import java.util.Scanner;

public class CalculadoraImc 
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
    public static void main(String []args)
    {
        Scanner entrada = new Scanner(System.in);
        String Continuar = "S";
        double peso, altura, imc;

        while (Continuar.equalsIgnoreCase("S"))
        {
            System.out.println("-----------------------");
            System.out.println("CALCULADORA DE IMC");
            System.out.println("-----------------------");

            System.out.println("Qual o seu peso?(Kg)");
            peso = entrada.nextDouble();

            System.out.println("Qual a sua altura?(M)");
            altura = entrada.nextDouble();

            imc = peso / (altura *  altura);

            System.out.printf("Seu peso é de %.2f, sua altura é de %.2f sendo assim seu IMC é de %.2f%n", peso, altura, imc);

            if (imc < 18.5)
            {
                System.out.println("Está abaixo do peso");
            }
            else if (imc < 25 )
            {
                System.out.println("Peso normal");
            }
            else if (imc < 30)
            {
                System.out.println("SobrePeso");
            }
            else if (imc < 35)
            {
                System.out.println("Obesidade Grau I");
            }
            else if (imc < 40)
            {
                System.out.println("Obesidade Grau II");
            } 
            else 
            {
                System.out.println("Obesidade Grau III (Mórbida)");
            }

            System.out.println("Deseja continuar? S/N");
            Continuar = lerSN(entrada); 
        }
        entrada.close();
    }
}
