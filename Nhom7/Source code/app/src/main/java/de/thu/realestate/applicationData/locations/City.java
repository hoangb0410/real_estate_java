package de.thu.realestate.applicationData.locations;
public class City {
    private final String name;
    private final String code;

    public City(String name,String code){
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

}
