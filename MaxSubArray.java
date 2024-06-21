package Arrays;

// Brute Force Algorithm
// Time Complexity: O(n**3)

class MaxSubArray{

    public static int maxSubArray(int numbers[]){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=numbers[k];
                }
                System.out.println("Sum is:"+sum);
                if(max<sum)
                        max=sum;
            }
        }
        return max;
    }

    public static  void main(String[] args) {
        int arr[]={2,4,6,8,10};
        System.out.println("Max Sub Array Sum is: "+maxSubArray(arr));
    }
}