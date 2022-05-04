package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pick any positive number bigger than 2 - that will be the number of integers in the array.");
        int n;
        int count = 0;
        int temp;
        while(true) {
            n = sc.nextInt();
            if (n <= 2) {
                System.out.println("The number you have entered is not valid. Pick another one.");
            } else {
                break;
            }
        }

        System.out.println("Specify each integer in the array. Note that only " + n + " integers will be read.");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        while(count < n-2) {
            temp = arr[count];
            arr[count] = arr[count+2];
            arr[count+2] = temp;
            count++;
        }



    }
}
