package com.example.simpleparadox.listycity;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

=======
import java.util.List;

public class CityList {
    private List<City> cities = new ArrayList<>();


    public void delete(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        }
        throw new IllegalArgumentException();
    }

    public int getListSize() {
        List<City> list = cities;
        int sizeOfTheList = list.size();
        return sizeOfTheList;
    }
>>>>>>> fd45683 (CityList file has been created and also a testfile for this has been created)
}
