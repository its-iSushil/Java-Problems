package LinkedMashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Remove_Duplicate_Elements {
    
    static public String Unique(String s){
 
        String u="";
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
        for(Entry<Character,Integer> entry:map.entrySet()){
            u+=entry.getKey();
        }
        return u;

    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=scan.nextLine();
        System.out.println("Original String: "+s);
        System.out.println("Unique String  : "+Unique(s));
    }
}
