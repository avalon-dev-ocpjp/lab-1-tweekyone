package ru.avalon.java.ocpjp.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import ru.avalon.java.ocpjp.labs.tasks.arrays.OneDimensionalArrays;
import ru.avalon.java.ocpjp.labs.tasks.arrays.TwoDimensionalArrays;

public class Lab {

    /**
     * Точка входа в приложение.
     * <p>
     * При входе в приложение, выполняется создание получение
     * экземпляра задания с использованием фабричного метода
     * {@code create} интерфейса {@link Exercise}.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args){
        
        OneDimensionalArrays oda = new OneDimensionalArrays();
        try {
            oda.run();
        } catch (IOException ex) {
            Logger.getLogger(Lab.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TwoDimensionalArrays tda = new TwoDimensionalArrays();
        try {
            tda.run();
        } catch (IOException ex) {
            Logger.getLogger(Lab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
