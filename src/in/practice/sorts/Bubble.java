package in.practice.sorts;

/**
 * @author Durairaja Vigneshwar Varadarajan
 * @project codes
 * @created 12/05/2021
 */
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

    public static void swap(int[] array, int i, int j){

        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
