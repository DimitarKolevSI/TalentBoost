package com.company;

import com.sun.jdi.InvalidTypeException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*int[][] Matrix = new int[7][7];
        int counter = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%3d",counter++);
            }
            System.out.println();
        }*/
        int n;
        try
        {
            n = scan.nextInt();
            if(n<=0) throw new InvalidTypeException();
        } catch (InvalidTypeException e) {
            System.out.println("The size cannot be 0 or less! Sorry!");
            return;
        }
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = i;
        }
        for(int i = 0;i<n;i++)
        {
            System.out.println(i);
        }



    }
}
