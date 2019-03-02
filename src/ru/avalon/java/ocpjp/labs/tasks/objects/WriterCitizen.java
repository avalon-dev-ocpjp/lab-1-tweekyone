package ru.avalon.java.ocpjp.labs.tasks.objects;

import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.io.IOException;

public class WriterCitizen implements ObjectWriter<Citizen> {

    @Override
    public void write(Citizen object) throws IOException {
        System.out.println("Citizen first name: ... " + object.getName());
        System.out.println("Citizen last name: .... " + object.getLastName());
        System.out.println("Citizenship: .......... " + object.getCountry().getName() + " | " + object.getCountry().getCode());
    }

    @Override
    public void close() throws IOException {

    }

}
