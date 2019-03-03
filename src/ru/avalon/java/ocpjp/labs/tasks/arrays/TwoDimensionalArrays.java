package ru.avalon.java.ocpjp.labs.tasks.arrays;

import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.Factory;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * Задание, направленное на получение умений и навыков объявления и
 * использования многомерных массивов.
 */
class DoubleArrayFactory implements Factory<int[][]> {

    int a = 10, b = 20;
    Random rnd = new Random();
    int i = a + rnd.nextInt((b - a) + 1);
    int j = a + rnd.nextInt((b - a) + 1);

    @Override
    public int[][] create() {

        int[][] array = new int[i][j];
        for (int l = 0; l < array.length; l++) {
            for (int w = 0; w < array[l].length; w++) {
                array[l][w] = rnd.nextInt(100);
            }
        }

        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[j] + "\t");
            }
            System.out.println(";");
        }
        System.out.println();
        return array;
    }

}

class SorterDouble {

    int[] arr;

    public int[][] run(int[][] array) {
        int i = array.length;
        int j = array[1].length;

        int countElem = 0;
        for (int[] tmpArr : array) {
            countElem += tmpArr.length;
        }
        int[] ret = new int[countElem];
        int indRet = 0;
        for (int[] tmpArr : array) {
            for (int elemTmpArr : tmpArr) {
                ret[indRet++] = elemTmpArr;
            }
        }
        Arrays.sort(ret);
        int b = 0;
        for (int c = 0; c < i; c++) {
            for (int v = 0; v < j; v++) {
                array[c][v] = ret[b++];
            }
        }
        return array;
    }
}

class WriterDouble implements ObjectWriter<int[][]> {

    @Override
    public void write(int[][] array) throws IOException {
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[j] + ",\t");
            }
            System.out.println(";");
        }
        System.out.println();
    }

    @Override
    public void close() throws IOException {
    }
}

public final class TwoDimensionalArrays implements Exercise {

    /**
     * Фабрика, создающая двумерный массив, содержащий случайные числа в
     * диапазоне от {@code 0} до {@code 100}.
     * <p>
     * Количество строк и столбцов должно быть случайным и колебатся в диапазоне
     * от {@code 10} до {@code 20}.
     * <p>
     * Массив должен быть прямоугольным. То есть количество элементов всех строк
     * должно совпадать, как и количество элементов всех столбцов.
     */
    /**
     * Выполняет соритровку двумерного массива таким образом, что все элементы
     * массива должны быть расположены по возрастанию слева направо, сверху
     * вниз.
     * <p>
     * Например: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
     */
    /**
     * Объект, отвечающий за вывод в консоль двумерного массива.
     * <p>
     * Массив, должен выводиться построчно.
     */
    private DoubleArrayFactory factory;
    private SorterDouble sort;
    private WriterDouble writer;

    public TwoDimensionalArrays() throws IOException {
        factory = new DoubleArrayFactory();
        sort = new SorterDouble();
        writer = new WriterDouble();
        run();
        
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
