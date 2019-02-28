/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.Comparator;

/**
 *
 * @author MultatulyIM
 */
public class ComparateCitizen implements Comparator<Citizen>{

    @Override
    public int compare(Citizen o1, Citizen o2) {
        int result;
        result=o1.getName().compareTo(o2.getName());
        if (result==0){
            result=o1.getLastName().compareTo(o2.getLastName());
            if (result==0){
                if((o1.getCountry()==null)&&(o2.getCountry()==null)){
                    return result;
                }else if(o1.getCountry()==null){
                    result=-1;
                    return result;
                }else if(o2.getCountry()==null){
                    result=1;
                    return result;
                }else{
                    result=o1.getCountry().getCode().compareTo(o2.getCountry().getCode());
                    return result;
                }
            }
            else{
                return result;
            }
        }else{
            return result;
        }
    }

   
}
