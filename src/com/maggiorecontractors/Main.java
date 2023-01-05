package com.maggiorecontractors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] newArray = randomArrays(5);
        System.out.println(Arrays.toString(newArray));

        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        Arrays.sort(newArray);
        int[] sortedArray = new int[newArray.length];
//        sortedArray = newArray;
        String tryManipulate = "";
        for (int i = newArray.length-1; i>-1; i--) {
            tryManipulate += newArray[i] + " ";

            

//            for (int j = 0; j < sortedArray.length; j++){
//                sortedArray[i] = newArray[j];
//            }
        }
        System.out.println("-".repeat(20));
        System.out.println(tryManipulate);
        System.out.println("-".repeat(20));
        String[] example = tryManipulate.split(" ");
        for (int i= 0; i < example.length; i++) {
            sortedArray[i] = Integer.parseInt(example[i]);
        }

//            System.out.println(newArray[i]);
//        boolean flag = true;
//            int temp;
//        while (flag) {
//            flag = false;
//            for (int i = 0; i < sortedArray.length - 1; i++) {
//                if ( sortedArray[i] < sortedArray[i+1]){
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//
//            }
//        }
        System.out.println(Arrays.toString(sortedArray));

        String[] stringArray = new String[10];

        String name = "Emmanuel";
        stringArray = name.split("");
        System.out.println(Arrays.toString(stringArray));
    }

    public static int[] randomArrays(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len ; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }

}


