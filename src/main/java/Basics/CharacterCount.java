package Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharacterCount {
    public static void main(String[] args) {
        String text="Apple";
        HashMap<Character, Integer> hashMap=new HashMap<>();
        for (Character ch:text.toCharArray()) {
            if(hashMap.containsKey(ch)){
                hashMap.put(ch, hashMap.get(ch)+1);
            }else {
                hashMap.put(ch, 1);
            }
        }


        Set<Map.Entry<Character, Integer>> count=hashMap.entrySet();
        for (Map.Entry<Character, Integer> c:count) {
            if(c.getValue()>1){
                System.out.println(c.getKey()+" : "+c.getValue());
            }
        }
    }
}
