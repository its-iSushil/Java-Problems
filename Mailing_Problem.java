public class Mailing_Problem {
    

    public static int timeTakenToMail(String keyboard, String s)
    {
        // Write your code here.
        int prev_index=0,curr_index=0,index=0,sum=0;
        for(int i=0;i<s.length();i++){
            curr_index= keyboard.indexOf(s.charAt(i));
            index=curr_index-prev_index;
            if(index<0) index*=-1;
            sum+=index;
            prev_index=curr_index;
        }
         
        return sum;
    }


    public static void main(String[] args) {
        
        String  s="phineas", keyboard = "bjqtcxmkgzfeowdlsuaypnivrh";
        int sum=timeTakenToMail(keyboard, s);
        System.out.println(sum);
    }
}
