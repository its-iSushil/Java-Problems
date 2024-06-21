package Bit_manipulation;

public class Bit_Operators {
    public static void main(String[] args) {
        //Bitwise AND operator
        System.out.println("5 & 6: "+ (5&6)); //4

        //Bitwise OR operator
        System.out.println("5 | 6: "+ (5|6)); //7

        //Bitwise XOR operator
        System.out.println("5 ^ 6: "+ (5^6)); //3

        //Bitwise left shift operator
        System.out.println("5 << 2: "+ (5<<2)); //20 [a<<b= a*2**b]

        //Bitwise right shift operator
        System.out.println("5 >> 2: "+ (5>>2)); //1 [a>>b= a/2**b]
    }
    
}
