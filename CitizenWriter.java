/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.IOException;
import java.util.ArrayList;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

/**
 *
 * @author MultatulyIM
 */
public class CitizenWriter implements ObjectWriter<Citizen>{

    @Override
    public void write(Citizen object) throws IOException {
        StringBuilder str=new StringBuilder();
        str.append(object.getName()).append(" ");
        str.append(object.getLastName()).append(" ");
        if (object.getCountry()!=null){
        str.append(object.getCountry().getCode()).append(" ");
        str.append(object.getCountry().getName());}
        else{
            str.append("No citizen");
        }
        System.out.println(str);
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
