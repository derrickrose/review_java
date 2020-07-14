package org.review.amz.design_pattern.creational.factory;

import lombok.ToString;

@ToString
public class LocationFactory {

    public static Location getInstance(String name, long numberInhabitants, String capitalName) {
        Location location;
        if (capitalName == null) {
            location = setValues(new City(), name, numberInhabitants);
        } else {
            location = setValues(new Country(), name, numberInhabitants);
            ((Country) (location)).setCapital(capitalName);
        }
        return location;
    }

    private static Location setValues(Location location, String name, long numberInhabitants) {
        location.setName(name);
        location.setNumberInhabitants(numberInhabitants);
        return location;
    }
}
