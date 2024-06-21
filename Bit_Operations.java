package Bit_manipulation;

public class Bit_Operations {


    public static int getIthBit(int n, int i){
        int bitMask=1<<i;
        if((n & bitMask)==0)return 0;
        else return 1;
    }

    public static int setIthBit(int n, int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {

        System.out.println(getIthBit(12, 2)); // 12=1100 -> 1
        System.out.println(setIthBit(16, 2)); // 12=1100 -> 20
       
    }
    
}
