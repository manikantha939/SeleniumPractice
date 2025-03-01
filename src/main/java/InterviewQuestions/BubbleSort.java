package InterviewQuestions;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={4, 2, 9, 1, 6};

        sortByDescending(arr);

        sortByAscending(arr);
    }

//    public static void sortByDescending(int arr[]){
//        int n= arr.length;
//        for (int i=0;i<n-1;i++){
//            for (int j=i+1;j<n;j++){
//                if(arr[i]<arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }

    public static void sortByDescending(int arr[]){
        Arrays.sort(arr);
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sortByAscending(int arr[]){
        int[] sorted=Arrays.stream(arr).boxed().sorted((a,b)-> b-a).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(sorted));
    }
}
