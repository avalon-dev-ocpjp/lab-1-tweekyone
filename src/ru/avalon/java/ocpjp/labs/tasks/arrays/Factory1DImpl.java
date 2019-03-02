package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Random;
import ru.avalon.java.ocpjp.labs.common.Factory;

public class Factory1DImpl implements Factory<int[]> {

    @Override
    public int[] create() {
        Random rand = new Random();
        // Array length
        int len = rand.nextInt(11) + 10;
        
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int r = rand.nextInt(101);
            res[i] = r;
        }
        return res;
    }
    
}
