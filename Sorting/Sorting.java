/**
 * This program sorts any array in different sorting methods.
 * Here I use 3 different methods of sorting.
 * It also displays the progress of how it sorts everything.
*/
//Imports the functions that I am going to use in the program
import java.util.*;
/**Creates the class for displaying the information to the user,
 * declares the array to be used,
 * it prints the array for the user to see it unsorted and then asks
 * the user to select what type of sorting he or she wants to use.
 */
public class Sorting{
    public static void main(String[] args){
        //Declares the new scanner object for me to use and read the user input
        Scanner scan = new Scanner(System.in);
        //Declares the array
        int sort[] = {2, 59, 34, 1, 44, 330, 5};
        //Prints the array
        System.out.println("Unsorted Array:");
        for(int i = 0; i < sort.length; i++){
            System.out.print(sort[i] + " ");
        }
        //Asks the user to choose a sorting type
        System.out.println("");
        System.out.println("Choose a way to sort the array:");
        System.out.println("1. Bubble sort");
        System.out.println("2. Selection sort");
        System.out.println("3. Quick sort");
        System.out.println("Type the number above:");
        //Reads user input
        String o = scan.nextLine();
        //Transforms the suer input into an integer value
        //This is done because the scanner can only recieve strings from the user
        int op = Integer.valueOf(o).intValue();
        //Here are conditionals or comparing user input to numbers related to the options given 
        if(op == 1){
            //Calls the class that has the algorithm for the sorting type chosen by the user
            BubbleSort.bubble(sort);
            //Prints the sorted array!
            System.out.println("Sorted!");
            for(int i = 0; i < sort.length; i++){
                System.out.print(sort[i] + " ");
            }
        }else if(op == 2){
            SelectionSort.selection(sort);
            System.out.println("Sorted!");
            for(int i = 0; i < sort.length; i++){
                System.out.print(sort[i] + " ");
            }
        }else if(op == 3){
            //Since quick sroting is kind of complex i had to do the agorithm as an object
            QuickSort d = new QuickSort();
            d.quick(sort, 0, (sort.length - 1));
            System.out.println("Sorted!");
            for(int i = 0; i < sort.length; i++){
                System.out.print(sort[i] + " ");
            }
        }else{
            //This is printed if the user input is not related to what I asked
            System.out.println("That is not what I asked :/");
        }
    }
}