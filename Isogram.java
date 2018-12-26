/* Allison Chen
   achen94
   609.107
   HW3 Task 2
*/

import java.util.Scanner;

/** Create the class Isogram.
*/
public class Isogram {

   /** Main method.
      Ignore @param args command line arguments.
   */
   public static void main(String[] args) {
   
      Scanner kb = new Scanner(System.in);
      
      //Prompt user for word
      System.out.print("Please enter a word (no spaces or punctuation, " 
                       + "please): ");
      String userWord = kb.nextLine();
      
      //Set index of first two characters you want to compare
      int i = 0;
      int j = 0;
   
      /*Set up a boolean condition, so that if a comparison
      at any point reveals the word to be NOT an isogram, you
      can end the program
      */
      boolean isIsogram = true;
      
      /* 
      1) Take the first character (i) of the word, compare it to
      each of the subsequent characters (j)
      2) If there are no repeats, move on to the second character,
      compare it to each of the subsequent characters
      3) Repeat until you are comparing the second-to-last character
      to the last character
      */
      while (i < userWord.length() - 1 && isIsogram) {
         
         while (j < userWord.length()) {
            if (j != i) {
               if (userWord.toLowerCase().charAt(i) 
                   == userWord.toLowerCase().charAt(j)) {
                  System.out.println("The word " + userWord 
                                     + " is NOT an isogram.");
                  isIsogram = false;
               }
            }
            j++;
         }
         //Increment i and reset j 
         i++;
         j = i;
      }
      
      /*If the word is still an isogram after the last comparison, 
      print the following
      */
      if (isIsogram) {
         System.out.println("The word " + userWord + " is an isogram.");
      } 
           
   } 
}
