import java.util.Scanner;
public class Madlibs{
    public static void main(String[] args) {
        System.out.print("Here is your madlibs: ");
        System.out.println("I went to the animal " + "<noun>" + ", the " + "<plural_noun>" + " and the " + "<number>" + " beasts were there.");
    
        Scanner sc = new Scanner(System.in);
        String noun = sc.nextLine();
        System.out.println("I went to the animal" + noun + ", the" + "<plural_noun>" + "and the" + "<number>" + "beasts were there.");


    }
}