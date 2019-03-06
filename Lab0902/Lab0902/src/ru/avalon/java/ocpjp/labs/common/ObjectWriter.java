package ru.avalon.java.ocpjp.labs.common;

import java.io.Closeable;
import java.io.IOException;

/**
 * Абстрактное представление об объекте, осуществляющем
 * вывод данных.
 *
 * @param <T> тип данных, подлежащих выводу
 */
public interface ObjectWriter<T> extends Closeable {

    /**
     * Осуществляет вывод объекта в нижележащий поток.
     *
     * @param object объект, который следует вывести
     * @throws IOException в случае ошибки нижележащего потока
     */
    
    void write(T object) throws IOException;
}
