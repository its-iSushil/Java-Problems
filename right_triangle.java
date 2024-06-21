package Pattern_Printing;

class right_triangle
{
    public static void main(String[] args) 
    {
        System.out.println("Right half triangle:");
        int count=1;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}