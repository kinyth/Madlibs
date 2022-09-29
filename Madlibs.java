/* Madlibs Game
 * Kenneth Truong
 * 27 September 2022
 * AP Computer Science A 
 * The code stores user input and outputs what the user types in a sentence
 * The precondition is that the user must type something into the teminal in order for the code to continue running 
 * The postcondition guarantees that the code will output a sentence, which includes what the user inputted 
 */

import java.util.Scanner;

public class Madlibs{
    public static void main(String[] args) {
        System.out.print("Here is your madlibs: ");
        String sentence = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";//displays the sentence the user will edit
        System.out.println(sentence);
        Scanner sc = new Scanner(System.in);//creates a scanner 
        
        for(int i = 0; i < 3; i++){//algorithm that goes through the sentence 3 times to replace the 3 blanks
            System.out.print("Please type in a " + sentence.substring(sentence.indexOf("<")+1,sentence.indexOf(">")) + ": ");//search for words that start and end with <> to retrieve part of speech
            String userInput = sc.nextLine();//user input
            String savedInput = sentence.substring(sentence.indexOf("<"),sentence.indexOf(">")+1);
            sentence = sentence.replace(savedInput, userInput);//replaces what was between <> with the user input
            System.out.println(sentence);//shows the progression of the sentence
        }
    }
}