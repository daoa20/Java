/**
 * This is the class that uses the quick sort algorithm.
 */
public class QuickSort{
    //here I create the parts method which takes three values, one for the minimum value, another one for the maximum, and anotherone for the array to be sorted
    int parts(int sort[], int min, int max){
        //here I declared a variable equal to the maximum value
        //and another one to be used as an index
        int a = sort[max];
        int i = (min-1);
        //here I use b to iterate inside the array
        for(int b = min; b < max; b++){
            //here I compare the iterative index to the maximum value declared above
            //then I used i++ to change the index hwre the minimum value is and use a temporary variable to do the sorting as I did in the previous algorithms
            if(sort[b] <= a){
                i++;
                int temp = sort[i];
                sort[i] = sort[b];
                sort[b] = temp;
            }
            //here same as before, updates the user with the current changes
        for(int d = 0; d < sort.length; d++){
            System.out.print(sort[d] + " ");
        }
        System.out.println("");
    }
    //here I sort the maxmimum variable; the difference from above is that now I am sorting the maximum variable
    int temp = sort[i+1];
    sort[i+1] = sort[max];
    sort[max] = temp;
    return i + 1;
}
//here I create the method quick() to be used as an object to use the algorithm
//here the method is set to take 3 parameters so that it can use them to sort the array
public void quick(int sort[], int min, int max){
    if(min < max){
        int c = parts(sort, min, max);
        quick(sort, min, (c-1));
        quick(sort, (c+1), max);
    }
}
//what I like about quick sort is that it sorts the minimum and maximum values almost at hte same time, making sorting quickr than other algorithms
}