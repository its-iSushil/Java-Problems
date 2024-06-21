package Arrays;

// Time complexity: O(n/2)
// Space Complexity: O(1)

public class ReverseOfArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int temp=0,end=arr.length-1,start=0;
        System.out.println("original");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
       
        System.out.println("Reverse");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
