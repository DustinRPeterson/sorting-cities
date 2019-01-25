package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class AreaComparator implements Comparator<City> {

    public int compare(City o1, City o2) {
        if(o1.getArea() < o2.getArea()) {
            return -1;
        } else if (o1.getArea() == o2.getArea()) {
            return 0;
        } else {
            return 1;
        }
    }
}
