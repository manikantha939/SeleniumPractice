package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfOccuranceOfNumberInArray {
    public static void main(String[] args) {
        int arr[]={4, 2, 9, 1, 6, 1, 4};

        HashMap<Integer, Integer> map=new HashMap<>();
        for (int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);

        for (int key:map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

    }


    public static void numberOfOccurance(int [] arr){
        
    }

}
