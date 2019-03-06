package ru.avalon.java.ocpjp.labs.tasks.arrays;

import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.Factory;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.io.IOException;
import java.util.Random;

/**
 * Задание, направленное на получение умений и навыков
 * объявления и использования одномерных массивов.
 */
public final class OneDimensionalArrays implements Exercise{
    
    /**
     * Фабрика, создающая одномерный массив случайной
     * длины, содержащие случайные числа в интервале
     * от {@code 0} до {@code 100}.
     *<p>
     * Длина массивов должна колебаться в диапазоне от
     * 10, до 20 элементов.
     */
    
        
    private Factory<int[]> factory;

    /**
     * Выполняет сортировку одномерного массива по
     * возрастанию.
     */
    
    private Sort<int[]> sort;

    /**
     * Объект, отвечающий за вывод одномерного массива в
     * консоль.
     * <p>
     * Массив следет выводить в одну строку, разделяя
     * элементы массива запятыми и пробелами. Массив должен
     * быть заключён в квадратные скобки.
     * <p>
     * Например: {@code [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]}
     */
    
    private ObjectWriter<int[]> writer;

    public OneDimensionalArrays() {     
        
       factory = new Factory<int[]>() {
           
           @Override
           public int[] create() {
               
        int rnd = (int) (10 + Math.random()*10);
        int [] array = new int[rnd];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*100);
            
        }
        
        return array;
           }
       };
       
       sort = new Sort<int[]>() {
           
           @Override
           public void run(int[] dataSet) {
               
        int [] array = (int[]) dataSet;
        for(int i = array.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++ ){
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array [j] = array[j+1];
                    array [j+1] = tmp;
                }
            }
        }
           }
       };
       
       writer = new ObjectWriter<int[]>() {
           @Override
           public void write(int[] object) throws IOException {
               
               System.out.print("[ ");
               
               for(int t:object){
                   
                   System.out.print(t + " ");
                                      
               }
               System.out.println(" ]");
           }

           @Override
           public void close() throws IOException {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       };
        
        
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

