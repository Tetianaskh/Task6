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
        if (index > array.length - 1) {
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
    public static int[] gluingArrays (int[] array1, int[] array2) {
        int[] gluedArray = new int[array1.length + array2.length];
        for (int i1 = 0; i1 < array1.length; i1++) {
            gluedArray[i1] = array1[i1];
        }
        for (int i2 = 0; i2 < array2.length; i2++) {
            gluedArray[gluedArray.length - 1] = array2[i2];
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
        String s = Arrays.toString(array1);
        String s1 = Arrays.toString(array2);
        System.out.println("Исходный массив 1: " + s);
        System.out.println("Исходный массив 2: " + s1);
        String s2 = Arrays.toString(gluingArrays(array1, array2));
        System.out.println("Склеенный массив: " + s2);
    }

    public static void main(String[] args) {
        exercise02();
    }
}