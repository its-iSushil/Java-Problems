package SearchingAlgorithm;

public class Binarysearch {
    public static int binarysearch(int numbers[],int key){
        int end=numbers.length-1,start=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key)
                return mid;
            else if(numbers[mid]<key)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        if(binarysearch(arr, 40)!=-1)
            System.out.println("Key present at index: "+binarysearch(arr, 40));
        else
            System.out.println("Key does not exist");
    }
}
