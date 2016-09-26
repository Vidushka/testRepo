package com.hsenid.mdArray;

/**
 * Created by Vidushka on 9/22/16.
 */
public class mdArray {

    /**
     * Output of for loops are puting to a array called 'arr' and print it
     */
    public static void for_piramid() {
        String[][] arr = new String[11][11];
        for (int s = 10; s > 0; s--) {
            for (int t = 0; t <= 10; t++) {
                if (t < s) {
                    arr [s][t] = " ";
                    System.out.print(arr[s][t]);
                }
                else {
                    arr [s][t] = "* ";
                    System.out.print(arr[s][t]);
                }
            }
            System.out.println();
        }
    }
}
