package test211208;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test211220 {
    public static void main(String[] args) {
        int[][] list1 = {{1, 2}, {2, 3}};
        int[][] list2 = {{3, 4}, {5, 6}};
        int[][] result = new int[list1.length][list1.length];

        for(int i = 0; i < list1.length; i++) {
            for(int j = 0; j < list2.length; j++) {
                result[i][j] = list1[i][j] + list2[i][j];
            }
        }
                System.out.printf("result = {{%d,%d}, {%d,%d}}",
                        result[0][0], result[0][1], result[1][0], result[1][1]);

        int[] list_arr = {4, 3, 2, 1};
        int[] list_arr2 = {2, 20, 10, 3, 5};

        ArrayList arr1 = new ArrayList();
        ArrayList arr2 = new ArrayList();
        for(int i : list_arr) {
            arr1.add(i);
        }
        for(int i : list_arr2) {
            arr2.add(i);
        }
        arr1.sort(null);
        arr2.sort(null);

        arr1.remove(0);
        arr2.remove(0);

        System.out.print("\nlist_arr = ");

            System.out.print(arr1 + " ");

        System.out.print("\nlist_arr2 = ");
            System.out.print(arr2 + " ");

    }
}
