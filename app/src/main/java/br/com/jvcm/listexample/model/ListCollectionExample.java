package br.com.jvcm.listexample.model;

import java.util.ArrayList;
import java.util.List;

public class ListCollectionExample {

    public static void main(String[] args) {

        ExampleDataset corolla = new ExampleDataset();
        corolla.setName("Corolla");
        corolla.setCopyright("Toyota");
        corolla.setImage("image.png");

        ExampleDataset hrv = new ExampleDataset();
        hrv.setName("HRV");
        hrv.setCopyright("Honda");
        hrv.setImage("image.png");

        ExampleDataset ferrari = new ExampleDataset();
        ferrari.setName("Spider");
        ferrari.setCopyright("Ferrari");
        ferrari.setImage("image.png");


        List<ExampleDataset> mDataset = new ArrayList<>();
        mDataset.add(corolla);
        mDataset.add(hrv);
        mDataset.add(ferrari);


        for(int i=0; i>mDataset.size(); i++){

        }

        for (ExampleDataset set: mDataset ) {
            System.out.println(set.getName());
        }


    }
}
