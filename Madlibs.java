import java.util.Scanner;

public class Madlibs{
    public static void main(String[] args) {
        System.out.print("Here is your madlibs: ");
        System.out.println("Once upon a time in a <adjective> land, a <noun> <adverb> grew.");
        System.out.print("Now type in an adjective: ");

        Scanner sc = new Scanner(System.in);
        String adjective = sc.nextLine();
        System.out.println("Once upon a time in a "+ adjective + " land, a <noun> <adverb> grew.");
        
        System.out.print("Now type in a noun: ");
        String noun = sc.next();
        

    }
}