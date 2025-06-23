package Asignments.InterviewQuestions.Arrays;

public class SortAnArrayWithoutUsingInbuiltMethod {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        for (Integer i:array) {
            System.out.print(i+" ");
        }
    }
}
