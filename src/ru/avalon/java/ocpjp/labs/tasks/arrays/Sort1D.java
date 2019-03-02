package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Arrays;

public class Sort1D implements Sort<int[]> {

    @Override
    public void run(int[] dataSet) {
        Arrays.sort(dataSet);
    }
    
}
