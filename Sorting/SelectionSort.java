/**
 * This is the class that uses the selection sort algorithm.
 */
public class SelectionSort{
    //here I create the selection() function
    public static void selection(int[] sort){
        int len = sort.length;
        for(int i = 0; i < (len-1); i++){
            //I set a minimum value for the section we are going to sort
            int min = i;
            for(int a = i + 1; a < len; a++){
                //here I compare every item in the array with the minimum value
                //declared above
                if(sort[a] < sort[min]){
                    //if the current value is less than the minimum set then
                    //the minimum chnages
                    min = a;
                }
            }
            //here I create  temporary variable to store the value to be mmoved
            //as I did in the bubble() function
            //then it is the same process of changing places for the values analyzed
            int temp = sort[min];
            sort[min] = sort[i];
            sort[i] = temp;
            //and then, same as last time, print it for a progress update with a line to separate it from the previous ones
            for(int b = 0; b < sort.length; b++){
                    System.out.print(sort[b] + " ");
            }
            System.out.println("");
        }
    }
}