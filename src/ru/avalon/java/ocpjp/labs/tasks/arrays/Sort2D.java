package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort2D implements Sort<int[][]> {

    @Override
    public void run(int[][] dataSet) {
        // Convert 2d array into 1d array
        ArrayList<Integer> flat = new ArrayList<>();
        for (int[] row: dataSet) {
            for (int elem: row) {
                flat.add(elem);
            }
        }
        Integer[] flatArray = flat.toArray(new Integer[flat.size()]);
        Arrays.sort(flatArray);
        // Convert 1d array into 2d array
        int c = 0;
        for (int i = 0; i < dataSet.length; i++) {
            for (int j = 0; j < dataSet[i].length; j++) {
                dataSet[i][j] = flatArray[c];
                c++;
            }
        }
    }
    
}
