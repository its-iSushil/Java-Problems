package Easy;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        if(isPrime(n))
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not prime number");
    }

    private static boolean isPrime(int n) 
    {
        if(n==1)
            return false;
        else if(n==2)
            return true;
        else{
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                    return false;
            }
            return true;
        }
          
    }
}
