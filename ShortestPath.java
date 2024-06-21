import java.util.Scanner;

public class ShortestPath {

    public static float findPath(String str){

        int X=0,Y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='S')
                X--;
            else if(str.charAt(i)=='W')
                Y--;
            else if(str.charAt(i)=='N')
                Y++;
            else if(str.charAt(i)=='E')
                X++;
        }

        int x=X*X;
        int y=Y*Y;
        return (float)Math.sqrt(x+y);

    }

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Coordinates: (EWNS)");
        String str=scan.nextLine();
        
        System.out.println("Shortest Distance is: "+findPath(str));

    }
    
}
