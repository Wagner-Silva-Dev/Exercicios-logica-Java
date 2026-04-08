package fundamentos.arrays;

public class ListaDeNomes {
    public void main(String[] args) {
        String[] Nomes = new String[5];

        Nomes[0] = "Ana";
        Nomes[1] = "Bruno";
        Nomes[2] = "Carlos";
        Nomes[3] = "Daniela";
        Nomes[4] = "Eduardo";

        for (String MostrarNomes : Nomes){
            System.out.println(MostrarNomes);
        }
    }
}
