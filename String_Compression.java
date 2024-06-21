
// Input: aaabbcccddddd
///Output: a3b2b3d5



public class String_Compression {

    public static String compres(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }      
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String name="sssaaannnnnn";
        System.out.println("Compressed String is: "+compres(name));
    }
}
