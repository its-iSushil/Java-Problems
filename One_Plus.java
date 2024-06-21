package Arrays;

import java.util.Scanner;

public class One_Plus {


    public static int[] plusOne(int[] digits){

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=scan.nextInt();
        System.out.println("Enter array elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=scan.nextInt();
        int[] a=plusOne(arr);
        for(int j=0;j<a.length;j++) System.out.print(a[j]+" ");
    }
    
}
