package Task3;

import java.util.Arrays;

public class Array3 {

    public static void main(String[] args) {


        int[]firstArray ={2,4,6,7,8,5,1};
        System.out.println("Original Array: " + Arrays.toString(firstArray));
        int firstArrayLength = firstArray.length;

        int[] copiedArray = Arrays.copyOf(firstArray,firstArrayLength);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        copyArray();

    }

    private static void copyArray(){
        int[]firstArray ={2,4,6,7,8,5,1};
        int[]secondArray = new int[firstArray.length];
        for(int i=0 ;i< firstArray.length;i++){
            secondArray[i]=firstArray[i];
        }

        System.out.println("Original Array: " + Arrays.toString(firstArray));
        System.out.println("Copied Array: " + Arrays.toString(secondArray));
    }


}

