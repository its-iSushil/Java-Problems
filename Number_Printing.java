package Pattern_Printing;

import Recursion.print_desc_no;

//  1 2 3 4 5
//  1 2 3 4
//  1 2 3
//  1 2
//  1


public class Number_Printing {
    public static void main(String[] args) {
        printPattern();
    }

   static void printPattern(){
        for(int i=0;i<5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
