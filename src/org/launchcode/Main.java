package org.launchcode;

import org.launchcode.comparators.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        //PopulationComparator comparator = new PopulationComparator();
        //cities.sort(comparator);

        CompoundComparator comparator = new CompoundComparator();
        comparator.add(new StateComparator());
        comparator.add(new PopulationComparator());

        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
