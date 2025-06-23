package Asignments.InterviewQuestions.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersInAString {
	public static void main(String[] args) {
		String word="hello";
		HashMap<Character, Integer> map = new HashMap<>();
		char[] c = word.toCharArray();
		for (char value : c) {
				if (map.containsKey(value)) {
                    map.put(value, map.getOrDefault(value, 0) + 1);
				} else {
                    map.put(value, 1);
				}
		}
		Set<Character> list = map.keySet();
		for (Character ch : list) {
			if(map.get(ch)>1){
				System.out.println(ch+" : "+map.get(ch));
			}
		}

//        duplicateCharacters("Learn Java Programming pp");
	}

//    public static HashMap<Character, Integer> duplicateCharacters(String learnJavaProgramming) {
//        HashMap<Character, Integer> dh = new HashMap<>();
//        char[] c = learnJavaProgramming.toCharArray();
//        for (char value : c) {
//            if (value != ' ') {
//                if (dh.containsKey(value)) {
//                    dh.put(value, dh.getOrDefault(value, 0) + 1);
//                } else {
//                    dh.put(value, 1);
//                }
//            }
//        }
////        HashSet<Character> list = dh.keySet();
//        for (Character ch : dh.keySet()) {
//            if(dh.get(ch)>1){
//                System.out.println(ch+" : "+dh.get(ch));
//            }
//        }
//        return dh;
//    }

}
