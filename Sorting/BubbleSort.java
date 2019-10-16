/**
 * This is the class that uses the bubble sort algorithm.
 */
public class BubbleSort{
    //here I create the bubble() function
    public static void bubble(int[] sort){
        int len = sort.length;
        int temp = 0;
        //here it goes for every item in the arrray
        for(int i = 0; i < len; i++){
            for(int a = 1; a < (len - i); a++){
                //here I compare if the previous item is greater than the
                //current one
                if(sort[a-1] > sort[a]){
                    //if so, I use a temporary vaiable called temp to store
                    //such value and replace the previous one with the current one
                    //then I set the current one to the temporary variable in 
                    //order to sort them
                    temp = sort[a-1];
                    sort[a-1] = sort[a];
                    sort[a] = temp;
                }
                //here I print the array for every move it does, so that the
                //user can see the progress
                for(int b = 0; b < sort.length; b++){
                    System.out.print(sort[b] + " ");
                }
                //here I print  a blank line for it to look nice and not everything in the same line
                System.out.println("");
            }
        }
    }
}