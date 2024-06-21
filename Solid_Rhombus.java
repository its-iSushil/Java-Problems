package Pattern_Printing;

import java.util.Scanner;

//      ******
//     ******
//    ******
//   ******
//  ******

public class Solid_Rhombus {
    public static void main(String[] args) {
    
    System.out.println("Enter value for n: ");
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print("  ");
        }
        for(int k=1;k<=n;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    
}
