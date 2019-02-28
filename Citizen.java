package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 * Абстрактное представление о гражданине
 */
public interface Citizen extends Person {

    /**
     * Возвращает страну гражданской принадлежности.
     *
     * @return экземпляр {@link Country} или {@code null}, в
     * случае отсутствия гражданской принадлежности.
     */
    Country getCountry();
}
