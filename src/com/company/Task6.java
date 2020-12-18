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
        int[] array = new int[]{5, 7, 9, 4, 2, 6, 1, 3, 8};
        String s = Arrays.toString(array);
        System.out.println("Исходный массив: " + s);
        System.out.println("Введите, пожалуйста, индекс удаляемого элемента");
        int index = sc.nextInt();
        String s2 = Arrays.toString(removingArrayElement(array, index));
        System.out.println("Новый массив: " + s2);
    }

//  public static int plusArray (int[] array, int[] array2) {
//        for (int i = 0; i < array.length + array2.length; i++) {
//
//        }
//  }

    /**
     * Задача 2. Склейки двух массивов
     */
    public static void exercise02() {

    }

    public static void main(String[] args) {
        exercise01();
    }
}