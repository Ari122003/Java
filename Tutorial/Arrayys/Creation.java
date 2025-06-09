package Arrayys;

import java.util.Arrays;

public class Creation {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};

        int []arr2 = new int[5];// dynamic

        //System.out.println(Arrays.binarySearch(arr, 67)); // retrun index if found else return negative

       //System.out.println( Arrays.binarySearch(arr,1,3,6));

      int []arr3 = Arrays.copyOf(arr,arr.length);// deep copy

      System.out.println(Arrays.equals(arr,arr3));

      Arrays.sort(arr); // sorts the array by using quick sort algo

        Arrays.reverse





    }
}
