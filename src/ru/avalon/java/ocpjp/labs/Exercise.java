package ru.avalon.java.ocpjp.labs;

import ru.avalon.java.ocpjp.labs.tasks.arrays.OneDimensionalArrays;

/**
 * Абстратное представление об упражнении.
 */
public interface Exercise {

    /**
     * Тело упражнения.
     * <p>
     * Содержит основной код упражнения.
     *
     * @throws Exception в случае возникновения исключительной
     * ситуации
     */
    void run() throws Exception;

    /**
     * Фабричный метод, порождающий задания на основании
     * переданых аргументов командной строки.
     * <p>
     * Пользователь должен передавать название задания,
     * с использованием аргумента {@code /exercise},
     * {@code -exercise}, {@code /e} или {@code -e}.
     * <p>
     * Например:
     * {@code java -jar lab1.jar -e comparison}
     * где: <b>{@code syntax}</b> - название задания, которое
     * следует запустить.
     *
     * @param args аргументы командной строки
     * @return Экземпляр класса, реализующего задание
     */
    static Exercise create(String[] args) {
        return new OneDimensionalArrays();
    }
}