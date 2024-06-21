package SortingAlgorithm;
import java.util.Scanner;

class Bubble_Sort
{

   public static void bubbleSort(int[] arr){
      int temp=0;
      for (int i = 0; i < arr.length-1; i++) {
         for(int j=0;j<arr.length-1-i;j++)
         {
            if(arr[j]>arr[j+1])
            {
               temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
            }
         }
         
      }
   }

    public static void main(String[] args) 
   {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter size of array");
      int n=scan.nextInt();
      int[] arr=new int[n];
      System.out.println("Enter arrray elements :");
      for (int i = 0; i < arr.length; i++) 
      {
         arr[i]=scan.nextInt();
      }
      System.out.println("Bubble Sort");
      bubbleSort(arr);
      for (int i = 0; i < arr.length; i++) 
      {
         System.out.print(arr[i]+" ");
      }
      
   }
}
