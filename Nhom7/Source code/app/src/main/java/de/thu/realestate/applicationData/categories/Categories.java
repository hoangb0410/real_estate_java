package de.thu.realestate.applicationData.categories;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Categories {
    private static final PropertyType[] PROPERTY_TYPES = {
            new PropertyType("Apartment", 1),
            new PropertyType("Office", 2),
            new PropertyType("Penthouse", 3),
            new PropertyType("Townhouse", 4),
            new PropertyType("Villa Compound", 5),
            new PropertyType("Residential Floor", 6),
            new PropertyType("Residential Building", 7),
            new PropertyType("Shop", 8),
            new PropertyType("Warehouse", 9),
            new PropertyType("Showroom", 10),
    };
    private final static Map<String, Integer> PROPERTIES_MAP = new HashMap<>();
    private final static String[] PROPERTIES_LIST;
    static {
        for (PropertyType p : PROPERTY_TYPES) {
            PROPERTIES_MAP.put(p.getName(),p.getId());
        }
        PROPERTIES_LIST = new String[PROPERTIES_MAP.size()];
        PROPERTIES_MAP.keySet().toArray(PROPERTIES_LIST);
        Arrays.sort(PROPERTIES_LIST);
    }
    public String[] getPropertyTypeNames() {
        return PROPERTIES_LIST;
    }
    public int getPropertyTypeId(String propertyTypeName){
        return PROPERTIES_MAP.get(propertyTypeName);
    }
    public String getPropertyTypeIdString(String propertyTypeName){
        return Integer.toString(PROPERTIES_MAP.get(propertyTypeName));
    }
}