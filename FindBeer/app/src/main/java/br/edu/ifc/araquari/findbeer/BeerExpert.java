package br.edu.ifc.araquari.findbeer;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBeers (String type) {

        List<String> beers = new ArrayList<String>();

        switch (type) {

            case "Pilsen":
                beers.add("Baden");
                beers.add("Eisenbahn");
                break;
            case "Bock":
                beers.add("Hausen");
                beers.add("Colorado");
                break;
//            case "Lager":
//            case "Ale":
//            case "Amber Ale Red":
//            case "Strong Ale":
//            case "Weissbier":
//            case "Barley Wine":
//            case "Stout":
//            case "Dubbel":
//            case "Malzbier":
//            case "Schwarzbier":

        }

        return beers;
    }

}