/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Random;
import ru.avalon.java.ocpjp.labs.common.Factory;

/**
 *
 * @author MultatulyIM
 */
public class TwoDimensionalArraysFactory implements Factory{
    int[][] array;
public static final int MIN_LENGHT=10;
public static final int MAX_LENGHT=20;
public static final int RANGE_VALUE=100;
    @Override
    public Object create() {
        Random random=new Random();
        int array_row=random.nextInt(MAX_LENGHT-MIN_LENGHT)+MIN_LENGHT;
        int array_col=random.nextInt(MAX_LENGHT-MIN_LENGHT)+MIN_LENGHT;
        array=new int[array_row][array_col];
        for (int i=0; i<array.length;i++){
            for (int j=0;j<array[0].length;j++)
            array[i][j]=random.nextInt(RANGE_VALUE);
        }
        return array;
    }
}
