package com.tanay;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] ints = new int[10];
	    int[] ints1 = new int[20];
	    int[] ints2 = new int[ints.length+ints1.length];
        System.out.println("Enter the 10 numbers in the first array:");
        for(int i=0;i<10;i++){
            ints[i]=scanner.nextInt();
        }
        System.out.println("Enter the 20 numbers in the second array:");
        for(int i=0;i<20;i++){
            ints1[i]=scanner.nextInt();
        }
        for(int i = 0;i<10;i++){
            ints2[i] = ints[i];
        }
        int k = 10;
        for(int i = 0;i<20;i++){
            ints2[k] = ints1[i];
            k++;
        }
        System.out.println(Arrays.toString(ints2));
    }
}
