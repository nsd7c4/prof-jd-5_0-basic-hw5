package com.RashidGafurov_INC_LOL;

public class Main {

    public static void main(String[] args) {
        //Assignment 1
        int[] array1 = new int[]{1, 2, 3};
        float[] array2 = new float[]{1.57f, 7.654f, 9.986f};
        String[] array3 = new String[]{"Zero", "One", "Two"};

        //Assignment 2
        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println(array1[array1.length - 1]);

        for (int i = 0; i < array2.length - 1; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println(array2[array2.length - 1]);

        for (int i = 0; i < array3.length - 1; i++) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println(array3[array3.length - 1]);

        //Assignment 3
        for (int i = array1.length - 1; i > 0; i--) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println(array1[0]);

        for (int i = array2.length - 1; i > 0; i--) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println(array2[0]);

        for (int i = array3.length - 1; i > 0; i--) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println(array3[0]);

        //Assignment 4
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i]++;
            }
            if (i != array1.length - 1) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.println(array1[array1.length - 1]);
            }


        }
    }
}