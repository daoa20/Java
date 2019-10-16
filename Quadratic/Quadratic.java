/**
 * This is a program for calculating the real roots for a quadratic equation.
 */
//here I import the tools that I am going to use in this program
//the scanner is for reading the user input and the math is for using square roots.
import java.util.Scanner;
import java.lang.Math;
public class Quadratic{
    public static void main(String[] args){
        //here I create the object for the scanner to e used
        Scanner scan = new Scanner(System.in);
        //here it prints the information about the program
        System.out.println("Quadratic equation solver");
        System.out.println("Write the values of a, b & c according do de from 'ax^2 + bx +c = 0'");
        System.out.println("Write a:");
        //here the scanner reads the user input for all the values needed for the calcuations
        String answer = scan.nextLine();
        //due to the scanner reading only strings I had to convert it to a numerical value to make calculations
        //I use doubble for the big quantity of decimals that it can store for it to be mnore precise
        double a = Integer.valueOf(answer).intValue();
        System.out.println("Write b:");
        answer = scan.nextLine();
        double b = Integer.valueOf(answer).intValue();
        System.out.println("Write c:");
        answer = scan.nextLine();
        double c = Integer.valueOf(answer).intValue();
        //here I do the algorithm for the quadratic formula for the two values that it ouputs
        double ans1 = ((-b)+(Math.sqrt((b*b)-4*a*c)))/(2*a);
        double ans2 = ((-b)-(Math.sqrt((b*b)-4*a*c)))/(2*a);
        //here the prgram checks if the numbers are real or not, and due to the simple purposes of this project I don't include complex numbers, so it prints that there are no real roots for this equation
        if(Double.isNaN(ans1) || Double.isNaN(ans2)){
            System.out.println("This equation has no real roots! All haill complex numbers!");
        }else{
            //here it prints out the answers in the x axis.
            System.out.println("The values of x are:");
            System.out.println("X1: " + ans1 + ", X2: " + ans2);
        }
    }
}