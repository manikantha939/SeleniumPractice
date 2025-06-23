package Asignments.InterviewQuestions.Strings;

import java.util.HashMap;

public class CountOfOccurancesOfEachCharacter {
    public static void main(String[] args) {
        String word = "Test Automation Java Automation";
//        System.out.println(DuplicateCharactersInAString.duplicateCharacters(word));
        wordCount(word);
    }

    private static void wordCount(String str) {
        String[] word = str.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : word) {
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            } else {
                hm.put(s, 1);
            }
        }
        System.out.println(hm);
    }
}
