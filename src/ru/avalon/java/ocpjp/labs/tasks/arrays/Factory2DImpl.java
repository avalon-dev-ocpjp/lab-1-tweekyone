package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Random;
import ru.avalon.java.ocpjp.labs.common.Factory;

public class Factory2DImpl implements Factory<int[][]> {

    @Override
    public int[][] create() {
        Random rand = new Random();
        int rows = rand.nextInt(11) + 10;
        int cols = rand.nextInt(11) + 10;
        
        int[][] res = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int r = rand.nextInt(101);
                res[i][j] = r;
            }
        }
        return res;
    }
    
}
