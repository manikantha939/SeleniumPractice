package Asignments.InterviewQuestions.Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        System.out.println(findCommonElements(array1,array2));
    }

    private static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> allEle=new HashSet<>();
        Set<Integer> commonEle=new HashSet<>();
        for (Integer i:array1) {
            allEle.add(i);
        }
        for (Integer a:array2) {
            if(allEle.contains(a)){
                commonEle.add(a);
            }
        }
        return commonEle;
    }
}
