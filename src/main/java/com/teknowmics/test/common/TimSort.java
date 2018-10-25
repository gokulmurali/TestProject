/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknowmics.test.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author gokul
 * @param<T>
 */
public class TimSort<T> {

    private static final int ARRAY_SIZE = 128;

    public static void main(String[] args) {

        Integer[] numbers = new Integer[ARRAY_SIZE];
        generateRandomNumbers(numbers);

        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.println(numbers[i]);
        }

    }

    private static void generateRandomNumbers(Integer[] numbers) {

        for (int i = 0; i < ARRAY_SIZE; i++) {
            numbers[i] = new Random().nextInt(2 * ARRAY_SIZE);
        }
    }
    
    public static <T extends Comparable> void sort(T[] array){
   
        
    }
}
