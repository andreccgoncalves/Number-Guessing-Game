/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class Homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner myKb = new Scanner(System.in);
        int[] userGuess = new int[10];
        int counter = 0;
        int count = 10;

        Random r = new Random();
        int rand = r.nextInt(100);

        System.out.print("Please pick a number between 1 and 100, you have 10 guesses: \n");

        for (int i = 0; i < userGuess.length; i++) {

            System.out.println("Chance " + (i + 1) + ": you have " + count + " tries left");
            count--;
            userGuess[i] = myKb.nextInt();

            if (userGuess[i] == rand) {
                System.out.println("You Win!!");
                break;

            } else if (count == 0) {

                System.out.println("Hard Luck!!");
                System.out.println("The number was: " + rand);

            }

            if (userGuess[i] < 1 || userGuess[i] > 100) {
                System.out.print("That was a waste - Please enter number between 1 and 100.\n");
            } 
            
            else {

                boolean isItDuplicate = false;
                
                for (int j = 0; j < counter; j++) {
                    
                    if (userGuess[i] == userGuess[j]) {
                        isItDuplicate = true;
                        
                    }
                }
                if (isItDuplicate == true) {
                    System.out.print("That was a waste – you already guessed that number!\n");
                }
                
                else {
                    userGuess[counter] = userGuess[i];
                    counter++;
                }
            }

        }

    }
}