package com.skuhleesi.beeradviser;

/**
 * Created by Mugen on 3/2/2017.
 */
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else{
            brands.add("Jail Pail Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}
