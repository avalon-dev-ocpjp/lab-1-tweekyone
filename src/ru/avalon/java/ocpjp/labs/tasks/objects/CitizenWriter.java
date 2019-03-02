package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

/**
 *
 * @author Ella
 */
public class CitizenWriter  implements ObjectWriter<Citizen>{

    @Override
    public void write(Citizen ctz) throws IOException {
        System.out.println(new StringBuilder().append(ctz.getName()).append(" ")
                .append(ctz.getLastName()).append(" - ")
                .append(ctz.getCountry().getName()).append(" (")
                .append(ctz.getCountry().getCode()).append(")").toString());
    }

    @Override
    public void close() {}
    
}
