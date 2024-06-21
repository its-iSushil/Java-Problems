package Pattern_Printing;

//          * * * * *
//         *       *
//        *       *
//       *       *
//      * * * * *

public class Hollow_rhombus_pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--)
                System.out.print(" ");
            for(int k=1;k<=5;k++){
                if(k==1 || i==1 || k==5 || i==5){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
