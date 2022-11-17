package com.example.application;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {









    }
    static int arrayLargest(int...arr){
        int firstElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>firstElement){
                firstElement = arr[i];
            }
        }return firstElement;
    }
    static boolean isLeapYear(int year){

        return year % 4 == 0;
    }
    static boolean isPrimeNumber(int num){
        int m = num/2;
        for (int i = 2; i <= m; i++) {
            if ( num%i==0){
                return false;
            }
        }
        return true;

    }

}
