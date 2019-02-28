/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;
import ru.avalon.java.ocpjp.labs.tasks.objects.Citizen;
import ru.avalon.java.ocpjp.labs.tasks.objects.Persons;

/**
 *
 * @author MultatulyIM
 */
public class ArraysWriter implements ObjectWriter {

    @Override
    public void write(Object object) throws IOException {
        if (object instanceof int[]) {
            writeOneDimArray((int[]) object);

        }
        if (object instanceof int[][]) {
            for (int i = 0; i < ((int[][]) object).length; i++) {
                writeOneDimArray(((int[][]) object)[i]);
            }
        }
        
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void writeOneDimArray(int[] array) {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            str.append(array[i]).append(", ");
        }
        str.trimToSize();
        str.deleteCharAt(str.length()-1);
        str.deleteCharAt(str.length()-1);
        str.append("]");
        System.out.println(str);
    }

}
