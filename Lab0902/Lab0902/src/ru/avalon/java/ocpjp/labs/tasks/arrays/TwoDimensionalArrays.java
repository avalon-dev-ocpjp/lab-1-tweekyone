package ru.avalon.java.ocpjp.labs.tasks.arrays;

import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.Factory;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Задание, направленное на получение умений и навыков
 * объявления и использования многомерных массивов.
 */
public final class TwoDimensionalArrays implements Exercise{
    /**
     * Фабрика, создающая двумерный массив, содержащий
     * случайные числа в диапазоне от {@code 0} до
     * {@code 100}.
     * <p>
     * Количество строк и столбцов должно быть случайным
     * и колебатся в диапазоне от {@code 10} до {@code 20}.
     * <p>
     * Массив должен быть прямоугольным. То есть
     * количество элементов всех строк должно совпадать,
     * как и количество элементов всех столбцов.
     */
    private Factory<int[][]> factory;

    /**
     * Выполняет соритровку двумерного массива таким
     * образом, что все элементы массива должны быть
     * расположены по возрастанию слева направо, сверху
     * вниз.
     * <p>
     * Например:
     *  1  2  3  4  5
     *  6  7  8  9 10
     * 11 12 13 14 15
     * 16 17 18 19 20
     */
    private Sort<int[][]> sort;

    /**
     * Объект, отвечающий за вывод в консоль двумерного
     * массива.
     * <p>
     * Массив, должен выводиться построчно.
     */
    private ObjectWriter<int[][]> writer;

    public TwoDimensionalArrays() {

        factory = () -> {
            
            int rnd = (int) (10 + Math.random()*10);            
            int [][] array = new int[rnd][rnd];
            for(int i = 0; i < array.length; i++){
                for(int j = 0 ; j < array[i].length; j++){
                    array[i][j] = (int) (Math.random() * 100);
                }
            }
            
            return array;
        };
        
        writer = new ObjectWriter<int[][]>(){
            @Override
            public void write(int[][] object) throws IOException {
                for(int i = 0; i < object.length; i++){
                    
                    for(int j = 0; j < object[i].length; j++){
                        System.out.print(object[i][j] + "\t");
                    }
                    
                    System.out.println();
                    
                }
            }

            @Override
            public void close() throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
        
        sort = (int[][] dataSet) -> {
            for(int i = 0; i < dataSet.length; i++){                
                for(int j = 0; j < dataSet[i].length; j++){
                for (int k = 0; k < dataSet.length; k++) {
                    for (int n = 0; n < dataSet[k].length; n++) {
                        if (dataSet[k][n] > dataSet[i][j]) {
                            int tmp = dataSet[k][n];
                            dataSet[k][n] = dataSet[i][j];
                            dataSet[i][j] = tmp;
                        }
                    }
                }
                }
            }
                
        };
        
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        int[][] array = factory.create();
        sort.run(array);
        writer.write(array);
    }

}
