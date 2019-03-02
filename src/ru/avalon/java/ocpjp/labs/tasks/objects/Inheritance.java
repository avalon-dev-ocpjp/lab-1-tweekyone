package ru.avalon.java.ocpjp.labs.tasks.objects;

import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.io.IOException;
import java.util.*;

/**
 * Задание, направленное на изучение следующих тем:
 * 1. наследование;
 * 2. полиморфизм;
 * 3. использование коллекции ArrayList
 */
public final class Inheritance implements Exercise {

    /**
     * Объект, выполняющий сравнение объектов типа
     * {@link Citizen}.
     */
    private Comparator<Citizen> comparator;

    /**
     * Источник случайного набора экземпляров класса
     * {@link Citizen}.
     * <p>
     * Объектов в источнике должно быть случайное количечство
     * в диапазоне от {@code 20} до {@code 30}.
     * <p>
     * Формировать экземпляры следует с использованием данных
     * словарей, расположенных в пакете
     * {@link ru.avalon.java.ocpjp.labs.resources}.
     */
    private Iterable<Citizen> source;

    /**
     * Объект, отвечающий за вывод экземпляров {@link Citizen}
     * в консоль.
     */
    private ObjectWriter<Citizen> writer;

    public Inheritance() {
        Random rnd = new Random();
        int num = rnd.nextInt(11) + 20;
        ArrayList<Citizen> sourceArr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            sourceArr.add(new CitizenImpl());
        }
        this.source = sourceArr;

        writer = new WriterCitizen();

        comparator = new CompareCitizens();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        List<Citizen> citizens = new ArrayList<>();

        // TODO(Студент): Добавить все элементы, доступные в объекте source, в коллекцию citizens
        for (Citizen s: source) {
            citizens.add(s);
        }

        // TODO(Студент): Отсортировать список citizens перед выводом в поток
        // Compare by name in ascending order
        Collections.sort(citizens, comparator);

        // TODO(Студент): Пользуясь объектом writer вывести список citizens в консоль
        for (Citizen c: citizens) {
            try {
                writer.write(c);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
