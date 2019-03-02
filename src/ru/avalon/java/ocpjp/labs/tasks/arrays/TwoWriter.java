package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

/**
 *
 * @author java
 */
public class TwoWriter implements ObjectWriter<int[][]> {

    @Override
    public void write(int[][] object) throws IOException {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < object.length; ++i) {
            for (int j = 0; j < object.length; ++j) {
                b.append(String.format("%4d", object[i][j]));
            }
            b.append("\n");
        }
        System.out.print(b);
    }

    @Override
    public void close() {}

}
