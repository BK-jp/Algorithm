package baekjoon.Num9663;

import java.util.Scanner;

public class Num9663 {
    static int count = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] col = new int[n];

        for(int i=0;i<n;i++) {
            col[0] = i;
            nqueen(0,col);
        }
        System.out.println(count);
        input.close();
    }

    public static boolean rule(int index, int col[]) {
        int k = 0;
        boolean swit = true;
        while(k < index && swit) {
            if(col[k] == col[index] || Math.abs(col[k] - col[index]) == index - k) {
                swit = false;
            }
            k++;
        }
        return swit;
    }

    public static void nqueen(int index, int[] col) {
        if(rule(index,col)) {
            if(index == col.length-1) {
                count++;
            }
            else {
                for(int i=0;i<col.length;i++) {
                    col[index + 1] = i;
                    nqueen(index+1,col);
                }
            }
        }
    }
}
