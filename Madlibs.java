/* Madlibs Game
 * Kenneth Truong
 * 27 September 2022
 * AP Computer Science A 
 * The code stores user input and outputs what the user types in a sentence 
 */

import java.util.Scanner;

public class Madlibs{
    public static void main(String[] args) {
        System.out.print("Here is your madlibs: ");
        System.out.println("Once upon a time in a <adjective> land, a <noun> <adverb> grew.");
        System.out.print("Now type in an adjective: ");

        Scanner sc = new Scanner(System.in);//user input will be taken and stored in the "adjective" variable in the next line
        String adjective = sc.nextLine();
        System.out.println("Once upon a time in a "+ adjective + " land, a <noun> <adverb> grew.");
        
        System.out.print("Now type in a noun: ");
        String noun = sc.next();//user input is direcly taken and stored in the variable "noun"
        System.out.println("Once upon a time in a "+ adjective + " land, a " + noun + " <adverb> grew.");
        
        System.out.println("Finally, type in a adverb: ");
        String adverb = sc.next();//user input is stored in "adverb"
        System.out.println("Here is your completed Madlibs: ");
        System.out.println("Once upon a time in a "+ adjective + " land, a " + noun + " " + adverb +" grew.");//Outputs all of the users inputs in a sentence template
        

    }
}