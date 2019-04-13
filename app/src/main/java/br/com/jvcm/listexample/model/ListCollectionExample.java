package br.com.jvcm.listexample.model;

import java.util.ArrayList;
import java.util.List;

import br.com.jvcm.listexample.R;

public class ListCollectionExample {

    public static void main(String[] args) {

        ExampleDataset corolla = new ExampleDataset();
        corolla.setName("Corolla");
        corolla.setCopyright("Toyota");
        corolla.setImage(R.drawable.ic_logo_gm);

        ExampleDataset hrv = new ExampleDataset();
        hrv.setName("HRV");
        hrv.setCopyright("Honda");
        hrv.setImage(R.drawable.ic_honda_logo);

        ExampleDataset ferrari = new ExampleDataset();
        ferrari.setName("Spider");
        ferrari.setCopyright("Ferrari");
        ferrari.setImage(R.drawable.ic_logo_gm);


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
