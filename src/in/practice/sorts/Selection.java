package in.practice.sorts;

/**
 * @author Durairaja Vigneshwar Varadarajan
 * @project codes
 * @created 13/05/2021
 */

// Selection sort is an InPlace Sorting Algorithm
// Selection sort is an Unstable Sorting Algorithm
// O(n^2) -  quadratic complexity

public class Selection {

    public static void main(String[] args){

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int unSorttedindex = intArray.length - 1; unSorttedindex > 0  ; unSorttedindex--) {
            int largeIndex = 0;
            for (int i=1; i<=unSorttedindex; i++){
                if(intArray[i] > intArray[largeIndex]){
                    largeIndex = i;
                }
            }

            swap(intArray, unSorttedindex, largeIndex);

        }


        for (int num:
             intArray) {
            System.out.println(num);

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

// Steps:
//        [20, 35, -15, 7, 55, 1, -22]
//        [20, 35, -15, 7, -22, 1, 55]
//        [20, 1, -15, 7, -22, 35, 55]
//        [-22, 1, -15, 7, 20, 35, 55]
//        [-22, 1, -15, 7, 20, 35, 55]
//        [-22, -15, 1, 7, 20, 35, 55]