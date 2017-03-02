package com.skuhleesi.beeradviser;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    //Call when the user clicks the button
    public void onClickFindBeer(View view){
        //Get a reference to the text view
        TextView brands = (TextView) findViewById(R.id.brands);
        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //Get recommendations from the BeerExpert class
        List<String> brandsList = expert.getBrands(beerType);
        //Build a string using the values in the list
        StringBuilder brandsFormatted = new StringBuilder();

        for(String brand:brandsList){
            brandsFormatted.append(brand).append('\n');
        }

        //Display the beers
        brands.setText(brandsFormatted);
    }
}
