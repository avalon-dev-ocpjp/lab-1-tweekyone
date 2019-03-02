package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CitizenImpl implements Citizen {
    
    private Country country;
    private String firstName;
    private String lastName;
    
    public CitizenImpl() {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\countries.txt"))) {
            //int lines = 0;
            String line;
            ArrayList<String> linesArray = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                //lines++;
                linesArray.add(line);
            }
            Random rnd = new Random();
            
            //String countryDef = (String) br.lines().toArray()[rnd.nextInt(lines + 1)];
            String countryDef = linesArray.get(rnd.nextInt(linesArray.size() + 1));
            this.country = new CountryImpl(countryDef.split(":")[0], countryDef.split(":")[1]);
        } catch (IOException ex) {
            ex.printStackTrace();
            this.country = null;
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader("src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\first-names.txt"))) {
            //int lines = 0;
            String line;
            ArrayList<String> linesArray = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                //lines++;
                linesArray.add(line);
            }
            Random rnd = new Random();
            
            //this.firstName = (String) br.lines().toArray()[rnd.nextInt(lines + 1)];
            this.firstName = linesArray.get(rnd.nextInt(linesArray.size() + 1));
        } catch (IOException ex) {
            ex.printStackTrace();
            this.firstName = null;
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader("src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\last-names.txt"))) {
            //int lines = 0;
            String line;
            ArrayList<String> linesArray = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                //lines++;
                linesArray.add(line);
            }
            Random rnd = new Random();
            
            //this.lastName = (String) br.lines().toArray()[rnd.nextInt(lines + 1)];
            this.lastName = linesArray.get(rnd.nextInt(linesArray.size() + 1));
        } catch (IOException ex) {
            ex.printStackTrace();
            this.lastName = null;
        }
    }
    
    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public String getName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
    
}
