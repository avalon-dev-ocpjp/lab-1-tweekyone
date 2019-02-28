/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Arrays;

/**
 *
 * @author MultatulyIM
 */
public class Sorter implements Sort{

    @Override
    public void run(Object dataSet) {
        if (dataSet instanceof int[]){
        Arrays.sort((int[])dataSet);
        }
        if (dataSet instanceof int[][]){
            int new_arr_len=((int[][]) dataSet).length*((int[][]) dataSet)[0].length;
        int[] sort_arr=new int[new_arr_len];
        int r=0;
        int c=0;
        for(int i=0;i<sort_arr.length;i++){
            r=i/((int[][]) dataSet)[0].length;
            c=i%((int[][]) dataSet)[0].length;
            sort_arr[i]=((int[][]) dataSet)[r][c];
        }
        Arrays.sort(sort_arr);
        for(int i=0;i<sort_arr.length;i++){
            r=i/((int[][]) dataSet)[0].length;
            c=i%((int[][]) dataSet)[0].length;
            ((int[][]) dataSet)[r][c]=sort_arr[i];
        }
        
        }
        
    }
    
}
