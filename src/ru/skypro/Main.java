package ru.skypro;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] arr2 = new double[3];
        arr2[0] = 1.123;
        arr2[1] = 3.55;
        arr2[2] = 8.155;
        char[] arr3 = new char[3];
        arr3[0] = 'a';
        arr3[1] = 'g';
        arr3[2] = 'y';
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "    ");
            }
            else {
                System.out.print(arr[i] + ", ");
                }
            }
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr2[i] + "    ");
            }
            else {
                System.out.print(arr2[i] + ", ");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr3[i] + "    ");
            }
            else {
                System.out.print(arr3[i] + ", ");
            }
        }


        for (int i = arr.length - 1; i > -1; i--) {
            if (i != 0){
                System.out.print(arr[i] + ", ");
            }
            else {
                System.out.print(arr[i] + "     ");
            }
        }
        for (int i = arr.length - 1; i > -1; i--) {
            if (i != 0){
                System.out.print(arr2[i] + ", ");
            }
            else {
                System.out.print(arr2[i] + "     ");
            }
        }
        for (int i = arr.length - 1; i > -1; i--) {
            if (i != 0){
                System.out.print(arr3[i] + ", ");
            }
            else {
                System.out.print(arr3[i] + "    ");
            }
        }

//        Task 4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                arr[i] += 1;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr.length - 1){
                System.out.print(arr[i] + ", ");
            }
            else {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
