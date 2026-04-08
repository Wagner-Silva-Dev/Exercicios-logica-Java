package fundamentos.arrays;

public class ListaDeNomes {
    public static void main(String[] args) {
        String[] nomes = new String[5];

        nomes[0] = "Ana";
        nomes[1] = "Bruno";
        nomes[2] = "Carlos";
        nomes[3] = "Daniela";
        nomes[4] = "Eduardo";

        double[] notas = new double[5];
        notas[0] = 8.5;
        notas[1] = 6.0;
        notas[2] = 9.5;
        notas[3] = 4.0;
        notas[4] = 7.5;

        for (int contador = 0; contador < nomes.length; contador++) {
            System.out.println(nomes[contador] + " - "  + notas[contador]);
        }
    }
}