package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 * Аьстрактное представление о стране.
 */
public interface Country {

    /**
     * Возвращает код страны.
     *
     * @return код странные в виде строки
     * @see <a href="https://en.wikipedia.org/wiki/Country_code">Country code</a>
     */
    String getCode();

    /**
     * Возвращает название страны.
     *
     * @return название страны.
     */
    String getName();
}
