package ru.avalon.java.ocpjp.labs.tasks.arrays;

import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.Factory;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.io.IOException;
import java.util.Random;
import java.util.Arrays;

/**
 * Задание, направленное на получение умений и навыков объявления и
 * использования одномерных массивов.
 */
class IntArrayFactory implements Factory<int[]> {

    int a = 10, b = 20;
    Random rnd = new Random();
    int i = a + rnd.nextInt((b - a) + 1);
    int[] array = new int[i];

    @Override
    public int[] create() {
        for (int j = 0; j < i; j++) {
            array[j] = rnd.nextInt(101);
        }
        return array;
    }
}

class Sorter implements Sort<int[]> {

    @Override
    public void run(int[] array) {
        Arrays.sort(array);
    }

}

class Writer implements ObjectWriter<int[]> {

    StringBuilder str;

    @Override
    public void write(int[] object) throws IOException {
        str = new StringBuilder();
        for (int i = 0; i < object.length;) {
            str.append(object[i]);
            str.append(", ");
        }
    }

    @Override
    public void close() throws IOException {

    }

}

public final class OneDimensionalArrays implements Exercise {

    /**
     * Фабрика, создающая одномерный массив случайной длины, содержащие
     * случайные числа в интервале от {@code 0} до {@code 100}.
     * <p>
     * Длина массивов должна колебаться в диапазоне от 10, до 20 элементов.
     */
    public IntArrayFactory factory;

    /**
     * Выполняет сортировку одномерного массива по возрастанию.
     */
    public Sorter sort;

    /**
     * Объект, отвечающий за вывод одномерного массива в консоль.
     * <p>
     * Массив следет выводить в одну строку, разделяя элементы массива запятыми
     * и пробелами. Массив должен быть заключён в квадратные скобки.
     * <p>
     * Например: {@code [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]}
     */
    private Writer writer;

    public OneDimensionalArrays() throws IOException {
        factory = new IntArrayFactory();
        sort = new Sorter();
        writer = new Writer();
        run();

        // TODO(Студент): Выполнить инициализацию полей класса OneDimensionalArrays
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        int[] array = factory.create();
        sort.run(array);
        writer.write(array);
    }
}
