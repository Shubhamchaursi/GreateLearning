package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan=new Scanner(System.in);
        int arr[]={2,5,8,4};
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++) {

            System.out.println(arr[i]);
        }
    }
}
