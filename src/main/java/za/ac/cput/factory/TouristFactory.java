package za.ac.cput.factory;

import za.ac.cput.domain.Tourist;

public class TouristFactory {

    public static Tourist getTourist(String name, String sName, int age){
        return new Tourist.Builder().
                tourName(name).
                tourSurname(sName).
                age(age).
                build();
    }
}
