package com.example.application;

import android.text.format.Time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        int[] nums = {1,2,4,6,8,9,10,15,67,83,24,55};
        Random rd = new Random();
        int randomNum = rd.nextInt(nums.length-1);
        System.out.println(nums[randomNum]);

    }
    public static void printFibonacciSeries(int count) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
    public static boolean stringContainsVowels(String input) {

        return input.toLowerCase().matches(".*[aeiou].*");

    }
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    static void randomNumber(int[] arr){
        Random rd = new Random();
        for (int x:arr
             ) {
            x = rd.nextInt();
            System.out.println(arr[x]);
        }

    }
    static void countOccurrences(String str,char c){
        String ans = str.toLowerCase(Locale.ROOT);
        int count = 0;
        for (int i = 0; i < ans.length(); i++) {
            if (c==ans.charAt(i)){
                count++;
            }

        }
        System.out.println(count);
    }
    static int romanToInteger(int num){

        switch (num){
            case 1:
                System.out.println("I");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;


        }
        return num;
    }
    static void vowelsCount(String str){
        String word = str.toLowerCase(Locale.ROOT);
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'  ){
                vowels++;

            }
            else{
                consonants++;
            }
        }
        System.out.println("No. of vowels is " + vowels +"\n" +
                "No. of consonants is " + consonants);
    }
    static int arrayDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1+i; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    return arr[j];
                }
            }

        }
        return -1;
    }


}
