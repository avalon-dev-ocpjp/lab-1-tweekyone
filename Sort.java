package ru.avalon.java.ocpjp.labs.tasks.arrays;

/**
 * Абстрактное представление об объекте, выполняющем
 * сортировку.
 *
 * @param <T> тип контейнера, подлежащего сортировке
 */
public interface Sort<T> {

    /**
     * Выполняет сортировку.
     *
     * @param dataSet набор данных, который следует
     *                отсортировать
     */
    void run(T dataSet);
}
