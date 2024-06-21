package LinkedMashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Freq_of_each_element {

    public static void Freq_of_element(String s){
 
        String u="";
        char ch;
        int len=s.length();
        int freq=0;
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(s.charAt(i))==false){
                map.put(s.charAt(i), 1);
            }
            else
            {
               freq=map.get(s.charAt(i));
               freq++;
               map.put(s.charAt(i),freq);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            ch=entry.getKey();
            freq=entry.getValue();
            if(ch==' '){
                System.out.println("Space: "+freq);
            }else System.out.println(ch+": "+freq);
            
        }
      
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=scan.nextLine();
        System.out.println("Original String: "+s);
        Freq_of_element(s);
    }
    
}
