package fundamentos.arrays;

public class ListaDeNomes {
    public static void main(String[] args) {
        String[][] turma = {{"Ana", "8.5"}, {"Bruno", "6.0"}, {"Carlos", "9.5"}, {"Daniela", "4.0"}, {"Eduardo", "7.5"}
        };


        for (int contador = 0; contador < turma.length; contador++) {
            System.out.println(turma[contador][0]+ " - " + turma[contador][1]);
        }
    }
}