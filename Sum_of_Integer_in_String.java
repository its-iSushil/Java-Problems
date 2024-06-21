import java.util.Scanner;

public class Sum_of_Integer_in_String {

    static public int sum(String s){
        char ch;
        int sum=0,digit=0;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(Character.isDigit(ch)){
                
                sum=sum+Character.getNumericValue(ch);
            }
                
        }

        return sum;
    }
    

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=scan.nextLine();

        System.out.println("Entered sum of string is: "+sum(s) );

    }
}
