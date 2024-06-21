import java.util.Scanner;

public class Reverse_String 
{

    //function to return reversed string
    static public String Reverse(String word){
           String reverse="";
           for(int i=word.length()-1;i>=0;i--){
                reverse=reverse+word.charAt(i);
           } 
           return reverse;
    }
    public static void main(String[] args) {
     
        System.out.println("Enter a string");
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        System.out.println("Entered String: "+word);
        System.out.println("Reversed String: "+Reverse(word));
    }
}
