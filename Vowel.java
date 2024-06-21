import java.util.Scanner;

/*  Check if given string contains vowel or not.
 *  Print all the vowels from string
 * 
 */


public class Vowel {

    private static boolean containsVowel(String word){
        return word.toLowerCase().matches(".*[aeiou]*.");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any word");
        var word=scan.nextLine();
        if(containsVowel(word)) System.out.println("True");
        else System.out.println("False");
    }
    
}
