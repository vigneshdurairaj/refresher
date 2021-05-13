package in.practice.sorts;

import java.util.Arrays;

/**
 * @author Durairaja Vigneshwar Varadarajan
 * @project codes
 * @created 12/05/2021
 */

// Bubble sort is an InPlace Sorting Algorithm
// Bubble sort is an Stable Sorting Algorithm
// O(n^2) -  quadratic complexity

public class Bubble {
    public static void main(String[] args){

        int [] intArray = {40, 23,55,-1, 4,16,-123,3,123};

        for(int unSorttedLength = intArray.length - 1; unSorttedLength > 0 ; unSorttedLength --){

            for(int i=0; i<unSorttedLength; i++){
                if(intArray[i] > intArray[i+1])
                    swap(intArray, i, i+1);
            }
        }

        for (int i: intArray) {
            System.out.println(i);
        }

    }

    /**
     *
     * @param array array that is to be sorted
     * @param i first element index
     * @param j second element index
     */
    public static void swap(int[] array, int i, int j){

        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}

//Steps
//        [23, 40, -1, 4, 16, -123, 3, 55, 123]
//        [23, -1, 4, 16, -123, 3, 40, 55, 123]
//        [-1, 4, 16, -123, 3, 23, 40, 55, 123]
//        [-1, 4, -123, 3, 16, 23, 40, 55, 123]
//        [-1, -123, 3, 4, 16, 23, 40, 55, 123]
//        [-123, -1, 3, 4, 16, 23, 40, 55, 123]
//        [-123, -1, 3, 4, 16, 23, 40, 55, 123]
//        [-123, -1, 3, 4, 16, 23, 40, 55, 123]