package Pattern_Printing;

import java.util.Scanner;

//  *             *
//  * *         * *
//  * * *     * * *
//  * * * * * * * *
//  * * * * * * * *
//  * * *     * * *
//  * *         * *
//  *             *

public class Butterfly_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter value for n:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int k=1;k<=2*(n-i);k++)
                System.out.print("  ");
            for(int m=1;m<=i;m++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=1;i<=n+n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int k=1;k<=2*(n-i);k++)
                System.out.print("  ");
            for(int m=1;m<=i;m++)
                System.out.print("* ");
            System.out.println();
        }
    
    }
}
