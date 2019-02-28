/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.avalon.java.ocpjp.labs.common.Factory;

/**
 *
 * @author MultatulyIM
 */
public class CitizenFactory implements Iterable {

    ArrayList<Persons> source;
    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> lastname = new ArrayList<>();
    static ArrayList<Country> country = new ArrayList<>();

    static {
        String filedir = System.getProperty("user.dir") + "\\src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\";
        String filefn = filedir + "first-names.txt";
        String fileln = filedir + "last-names.txt";
        String filec = filedir + "countries.txt";

        try {
            FileReader fr = new FileReader(filefn);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                name.add(line);
            }

            br.close();
            fr.close();
            fr = new FileReader(fileln);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                lastname.add(line);
            }
            br.close();
            fr.close();
            int index;
            Countries countries;
            fr = new FileReader(filec);
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                index = line.indexOf(":");
                if (index!=-1){
                countries = new Countries(line.substring(0, index), line.substring(index + 1));
                country.add(countries);}
                else{
                    countries=new Countries("","");
                    country.add(countries);
                }
            }
            br.close();
            fr.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found! " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }

    }

    public CitizenFactory() {
        source = new ArrayList<>();
        Random random = new Random();
        int lenght = 20 + random.nextInt(10);
        for (int i = 0; i < lenght; i++) {
            source.add(new Persons(name.get(random.nextInt(name.size())), lastname.get(random.nextInt(lastname.size())),
                    country.get(random.nextInt(country.size()))));
        }
    }

    @Override
    public Iterator iterator() {

        return this.source.iterator();
    }

}
