package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    // Основные задачи:

    /**
     * Удаление элемена по индексу
     * @param array исходный массив
     * @param index индекс удаляемого элемента
     * @return новый массив
     */
    public static int[] removingArrayElement(int[] array, int index) {
        int[] array2 = new int[array.length - 1];
        for (int i = 0; i < array2.length; i++) {
            if (i < index) {
                array2[i] = array[i];
            } else {
                array2[i] = array[i + 1];
            }
        }
        return array2;
    }

    /**
     * Задача 1. Удаление элемента по индексу
     */
    public static void exercise01() {
        System.out.println("Добрый день!");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[] {5, 7, 9, 4, 2, 6, 1, 3, 8};
        String s = Arrays.toString(array);
        System.out.println("Исходный массив: " + s);
        System.out.println("Введите, пожалуйста, индекс удаляемого элемента");
        int index = sc.nextInt();
        if (index > array.length - 1 || index < 0) {
            System.out.println("Такого индекса в исходном массиве нет! Попробуйте еще раз :)");
        } else {
            String s2 = Arrays.toString(removingArrayElement(array, index));
            System.out.println("Новый массив: " + s2);
        }
    }

    /**
     * Склейка двух массивов
     * @param array1 массив 1
     * @param array2 массив 2
     * @return новый склеенный массив
     */
    public static int[] gluArrays (int[] array1, int[] array2) {
        int[] gluedArray = new int[array1.length + array2.length];
        int step = 0;
        for (int i = 0; i < array1.length; i++) {
            gluedArray[step++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            gluedArray[step++] = array2[i];
        }
        return gluedArray;
    }

    /**
     * Задача 2. Склейка двух массивов
     */
    public static void exercise02() {
        System.out.println("Добрый день!");
        int[] array1 = new int[] {3, 7, 1, 9, 0, 6};
        int[] array2 = new int[] {5, 2, 4, 8};
        String arr1 = Arrays.toString(array1);
        String arr2 = Arrays.toString(array2);
        System.out.println("Исходный массив 1: " + arr1);
        System.out.println("Исходный массив 2: " + arr2);
        String result = Arrays.toString(gluArrays(array1, array2));
        System.out.println("Склеенный массив: " + result);
    }

    public static void main(String[] args) {
        exercise01();
        exercise02();
    }

}