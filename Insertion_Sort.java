package SortingAlgorithm;


// Time Complexity: 


public class Insertion_Sort {

    public static void insertion_Sort(int[] arr){
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
            
        }
        
    }

    public static void main(String[] args) {
        int[] arr={5,3,1,2,4};
        
        insertion_Sort(arr);
        for(int j=0;j<arr.length;j++)
            System.out.print(arr[j]+" ");
        
        
    }
    
}
