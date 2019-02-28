/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 *
 * @author MultatulyIM
 */
public class Persons implements Citizen{
String name;
String lastname;
Country country;

    public Persons(String name, String lastname, Country country) {
        this.name = name;
        this.lastname = lastname;
        this.country = country;
    }

    @Override
    public Country getCountry() {
        if ((country.getCode().length()==0)||(country.getName().length()==0)){
          return null;  
        }else{
        return country;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastname;
    }
    
}
