package ru.skypro;

public class Main {
    public static void main(String[] args) {
//        Task 1

        int[] arr = new int[]{1, 2, 3};
        double[] arr_2 = new double[]{1.123, 4.456, 3.88};
        char[] arr_3= new char[]{'a', 'g', 'y'};
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.print(arr[i] + " ");
//            }
//            else {
//                System.out.print(arr[i] + ", ");
//                }
//            }
//        for (int i = 0; i < arr_2.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.print(arr_2[i] + " ");
//            }
//            else {
//                System.out.print(arr_2[i] + ", ");
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.print(arr_3[i] + " ");
//            }
//            else {
//                System.out.print(arr_3[i] + ", ");
//            }
//        }


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
                System.out.print(arr_2[i] + ", ");
            }
            else {
                System.out.print(arr_2[i] + "     ");
            }
        }
        for (int i = arr.length - 1; i > -1; i--) {
            if (i != 0){
                System.out.print(arr_3[i] + ", ");
            }
            else {
                System.out.print(arr_3[i] + "    ");
            }
        }
    }
}
