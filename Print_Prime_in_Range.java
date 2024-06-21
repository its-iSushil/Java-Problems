package Easy;

import java.util.Scanner;

public class Print_Prime_in_Range {

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
    public static void main(String[] args) {
        System.out.println("Enter start range and end range:");
        Scanner scan=new Scanner(System.in);
        int start=scan.nextInt();
        int end=scan.nextInt();
        
        for(int i=start;i<=end;i++){
           if(isPrime(i))
                System.out.print(i+" ");
        }
    }
}
