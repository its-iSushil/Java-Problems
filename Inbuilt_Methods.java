package SortingAlgorithm;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Inbuilt_Methods {

    public static void main(String[] args) {
        
        int[] arr={4,6,2,9,5,7,10,3,8,1};
        
        Arrays.sort(arr);
        System.out.print("Ascending Order: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        int[] arr1={4,6,2,9,5,7,10,3,8,1};
        Arrays.sort(arr1,3,7);
        System.out.print("\nFrom Index: 3, toIndex: 7 ---> ");
        for(int i=0;i<arr1.length;i++)
            System.out.print(arr1[i]+" ");

        Integer[] arr2={4,6,2,9,5,7,10,3,8,1};
        Arrays.sort(arr2,Collections.reverseOrder());
        System.out.print("\nReversed Array ---> ");
        for(int i=0;i<arr2.length;i++)
            System.out.print(arr2[i]+" ");
    
    }
    
}
