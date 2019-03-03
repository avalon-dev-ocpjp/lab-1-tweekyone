package ru.avalon.java.ocpjp.labs;

import java.io.IOException;
import java.util.Scanner;

public class Lab implements Exercise {

    /**
     * Точка входа в приложение.
     * <p>
     * При входе в приложение, выполняется создание получение экземпляра задания
     * с использованием фабричного метода {@code create} интерфейса
     * {@link Exercise}.
     *
     * @param args аргументы командной строки
     * @throws java.io.IOException
     */
    public static void main(String... args) throws IOException, Exception {
        args[1] = "Java";
        args[2] = "Lab";
       Scanner sc = new Scanner(System.in);
       args[3] = sc.nextLine();
       
        Exercise exercise = Exercise.create(args);
        try {
            exercise.run();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

        /*
         * TODO(Студент): Пользуясь терминалом, запустить все задания лабораторной работы
         * 1. Запустить задание OneDimensionalArrays
         * 2. Запустить задание TwoDimensionalArrays
         * 3. Запустить задание Inheritance
         */
    }

    @Override
    public void run() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
