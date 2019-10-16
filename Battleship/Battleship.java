/**
 * This program plays with the user the famous battleship game with the implementation of a two dimensional array.
 */
//here I import the tools to be used in this program
import java.util.*;
import java.lang.Math;
public class Battleship{
    public static void main(String[] args){
        //here I create the sacanner objject to read the user input
        Scanner scan = new Scanner(System.in);
        //here I print out the information about the game
        System.out.println("Welcome to my Battleship game!");
        //here I create a variable for the difficulty level to be chossen by the user below
        int diff = 0;
        //here I ask the user to choose the difficulty level
        System.out.println("Choose a difficulty to play: Easy, Intermediate or Hard");
        //here it reads the user input
        String ans = scan.nextLine();
        //here it compares the user answer with the difficulty levels set by me
        //the difficulty level is used as the number of moves that the user is allowed to make
        if(ans.equalsIgnoreCase("easy")){
            diff = 15;
        }else if(ans.equalsIgnoreCase("intermediate")){
            diff = 10;
        }else if(ans.equalsIgnoreCase("hard")){
            diff = 5;
        }else{
            System.out.println("Choose a difficulty to play: Easy, Intermediate or Hard");
        }
        //here I create the two dimensional array called board, to be used as a board, filled with Os simulating the ocean in the game
        String[][] board = {{"O ", "O ", "O ", "O ", "O "}, {"O ", "O ", "O ", "O ", "O "}, {"O ", "O ", "O ", "O ", "O "}, {"O ", "O ", "O ", "O ", "O "}, {"O ", "O ", "O ", "O ", "O "}};
        //here it prints the array for the user to see the board
        for(int i = 0; i < board.length; i++){
            for(int a = 0; a < board[i].length; a++){
                System.out.print(board[i][a]);
            }
            System.out.println("");
        }
        //here the program sets random places for the ships to be
        int randR = (int) (Math.random() * board.length);
        int randC = (int) (Math.random() * board.length);
        //here I create a variable for the turn that the user is in
        int turn = 1;
        //here I create a loop to be runningwhile the user is playing, I set it to be running as long as it does not go further than 15 turns, which is the easiest difficulty
        while(turn < 15){
            //here the program asks the user to guess a row to attack
            System.out.println("Guess Row:");
            //here the scanner reads the user input
            String g = scan.nextLine();
            //converts the input into a integer value
            int gR = Integer.valueOf(g).intValue();
            //here the program asks the user to guess a column to attack and does the same as above
            System.out.println("Guess Column");
            g = scan.nextLine();
            int gC = Integer.valueOf(g).intValue();
            //here I used conditionals to check if the input from the user matches the positions set by the program for the ship, then it replaces the "O" for an "X" to mark it as an attacked place 
            if((gR == randR) & (gC == randC)){
                System.out.println("Good shot! My ship is destroyed!");
                break;
            }else{
                if(((gR < 0) || (gR > 4)) || ((gC < 0) || (gC > 4))){
                    System.out.println("That is non even in the ocean!");
                }else if(board[randR][randC] == "X "){
                    System.out.println("You attacked that one already.");
                }else{
                    System.out.println("You missed :(");
                    board[gR][gC] = "X ";
                }
            }
            //here if the number of turns equals the difficulty level then the game is over
            if(turn == diff){
                System.out.println("GAME OVER");
                break;
            }
            turn++;
            //here it prints the turn munber and also prints out the board again to show the updated attacekd zones
            System.out.println("Turn " + (turn-1));
            for(int b = 0; b < board.length; b++){
                for(int c = 0; c < board[b].length; c++){
                    System.out.print(board[b][c]);
                }
                System.out.println("");
            }
        }
    }
}