package ru.avalon.java.ocpjp.labs.common;

/**
 * Абстрактное представление об эталоне проектирования
 * "Фабрика".
 *
 * @param <T> тип данных объектов, создаваемых фабрикой
 */
public interface Factory<T> {

    /**
     * Создаёт экземпляр заданного типа.
     *
     * @return Экземпляр типа {@code T}
     */
    
    T create();
}
