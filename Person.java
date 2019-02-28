package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 * Абстрактное представление о человеке.
 */
public interface Person {

    /**
     * Возвращает имя человека.
     *
     * @return имя человека
     */
    String getName();

    /**
     * Возвращает фамилию человека.
     *
     * @return фамилия человека
     */
    String getLastName();
}
