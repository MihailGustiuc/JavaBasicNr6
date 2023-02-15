package Task2;

import java.util.Arrays;

public class Array2  {

    public static void main(String[] args) {


        int[] UniDim = {2,3,4,5,6,7,8};

        System.out.println("Unidimensional: " +Arrays.toString(UniDim));

        int[][]BiDim = {{2,4,6,1}, {2,5,9,6}};
        System.out.println("Bidimensional: ");

        for(int i=0; i< BiDim.length;i++) {
            for (int j = 0; j < BiDim[i].length; j++) {
                System.out.print(BiDim[i][j] + " ");
            }
            System.out.println();
        }

        int suma =0;
        int numberOfOddNumbers = 0;
        int numberOfEvenNumbers = 0;

        for(int i =0;i< UniDim.length; i++){
            if(UniDim[i] %2 ==0){
                numberOfEvenNumbers++;

            }
            else numberOfOddNumbers++;

            suma= suma+ UniDim[i];
        }
        int average = suma/UniDim.length;
        System.out.println("Suma Array unidimensional: " +suma);
        System.out.println("Media Array unidimensional: " + average );
        System.out.println("Numrul de elemente pare pentru matricea unidimensionala: " + numberOfEvenNumbers);
        System.out.println("Numarul de elemente impare pentru matrice unidimensionala: " + numberOfOddNumbers );


        int suma1=0;
        int numberOfOddNumbers1 = 0;
        int numberOfEvenNumbers1 = 0;

        for(int i=0; i<BiDim.length;i++){
            for(int j=0; j< BiDim[i].length; j++){

                if(BiDim[i][j] % 2 ==0){
                    numberOfEvenNumbers1++;
                }
                else numberOfOddNumbers1++;

                suma1= suma1 +BiDim[i][j];

            }

        }
        float average1 =(float) suma1/(BiDim[0].length + BiDim[1].length);
        System.out.println("Suma Array bidimensional: " +suma1);
        System.out.println("Media Array bidimensional: " +average1);
        System.out.println("Numrul de elemente pare pentru matricea bidimensionala: " + numberOfEvenNumbers1);
        System.out.println("Numarul de elemente impare pentru matrice bidimensionala: " + numberOfOddNumbers1 );


    }
}
