package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompoundComparator implements Comparator<City> {
    List<Comparator<City>> comparators = new ArrayList<>();

    @Override
    public int compare(City o1, City o2) {

        int compResult = 0;
        for(int i = 0; i < comparators.size(); i++) {

            Comparator comparator = comparators.get(i);
            if(comparator.compare(o1, o2) == 0){

                compResult = comparator.compare(o1, o2);
                continue;
            } else {
                compResult =  comparator.compare(o1, o2);
                break;
            }


        }
        return compResult;
    }


    public void add(Comparator comparator) {
        comparators.add(comparator);
    }

}
