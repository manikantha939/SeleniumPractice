package Asignments.pattern;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String text="Manikantha";
        HashMap<Character, Integer> hashMap=new HashMap<>();
        for (Character c:text.toCharArray()) {
            if(hashMap.containsKey(c)){
               hashMap.put(c, hashMap.getOrDefault(c,0)+1);
            }else {
                hashMap.put(c, 1);
            }
        }
        System.out.println(hashMap);
    }
}
