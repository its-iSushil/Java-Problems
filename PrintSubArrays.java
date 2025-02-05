package Arrays;

// Output:
// 2 2 4  2 4 6  2 4 6 8  2 4 6 8 10  
// 4 4 6  4 6 8  4 6 8 10
// 6 6 8  6 8 10
// 8 8 10
// 10

public class PrintSubArrays {

    public static void printSubArrays(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubArrays(arr);
    }
}
