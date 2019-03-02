package ru.avalon.java.ocpjp.labs.tasks.objects;

public class CountryImpl implements Country {

    private String code;
    private String name;
    
    public CountryImpl(String code, String name) {
        this.code = code;
        this.name = name;
    }
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
