package Bit_manipulation;

import java.util.Scanner;

public class OddEven 
{
    public static void EvenOdd(int b){
        int bitmask=1;
        if((b & bitmask)==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter a number :");    
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        EvenOdd(b);
        // int n=b%10;
        // if(n==1)
        //     System.out.println("Number is odd");
        // else
        //     System.out.println("Number is even"); 
    }
}
