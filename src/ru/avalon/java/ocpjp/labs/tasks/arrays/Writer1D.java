package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

public class Writer1D implements ObjectWriter<int[]> {

    @Override
    public void write(int[] object) throws IOException {
        for (int o: object) {
            System.out.println(Integer.toString(o));
        }
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
