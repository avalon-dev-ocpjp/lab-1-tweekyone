package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.Comparator;

public class CompareCitizens implements Comparator<Citizen> {

    @Override
    public int compare(Citizen o1, Citizen o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
