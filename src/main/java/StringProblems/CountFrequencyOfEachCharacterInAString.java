package StringProblems;

import java.util.LinkedHashMap;

public class CountFrequencyOfEachCharacterInAString {
    public static void main(String[] args) {
        String str="hello";
        LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
        for (Character ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
