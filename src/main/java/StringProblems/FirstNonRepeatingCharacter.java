package StringProblems;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str="Swiss";
        LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
        for (Character ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        for (char c:map.keySet()){
            if(map.get(c)==1){
                System.out.println("Forst non repeating character: "+c);
                break;
            }
        }
    }
}
