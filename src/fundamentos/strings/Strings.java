package fundamentos.strings;

public class Strings{
    public static void main(String []args){
        String nome = "Nome testando";

        System.out.println("Qual a primeira letra do nome?\n" + nome.charAt(0)); //Vai retornar N, se fosse 2 o e assim por diante

        System.out.println("Qual a posição letra o no nome?\n" + nome.indexOf("o")); //Vai retornar 2, se colocassemos o retornaria 10

        int posicaoSobrenome = nome.indexOf(" ") + 1;
        System.out.println("Sobrenome: " + nome.substring(posicaoSobrenome)); // Vai criar uma "nova String" a partir do sobrenome
    }
}