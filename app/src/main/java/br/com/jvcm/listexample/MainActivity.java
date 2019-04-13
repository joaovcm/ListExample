package br.com.jvcm.listexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.jvcm.listexample.adapter.ExampleAdapter;
import br.com.jvcm.listexample.model.ExampleDataset;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private List<ExampleDataset> mDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateMock();
        mAdapter = new ExampleAdapter(mDataset);
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void populateMock() {
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

        mDataset = new ArrayList<>();
        mDataset.add(corolla);
        mDataset.add(hrv);
        mDataset.add(ferrari);
       // mDataset.notify(get);
    }
}
