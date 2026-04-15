package src.fundamentos.arrays;

public class AprendendoArrays {
//    Antes dos arrays
//    public static void main(String[] args) {
//        int idade1 = 25;
//        int idade2 = 40;
//        int idade3 = 55;
//
//        System.out.println(idade1);
//        System.out.println(idade2);
//        System.out.println(idade3);
//
//    }
//}
    public static void main(String[] args) {
        int []idades = new  int[3];
        idades[0] = 25;
        idades[1] = 40;
        idades[2] = 55;

        /*for (int i = 0; i < idades.length; i++) {
            System.out.println( idades[i] );
        }*/

        /* jeito simplificado com foreach*/
          for(int idade: idades){
              System.out.println(idade);
          }
    }
}