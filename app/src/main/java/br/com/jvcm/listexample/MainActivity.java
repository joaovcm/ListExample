package br.com.jvcm.listexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.jvcm.listexample.adapter.ExampleAdapter;
import br.com.jvcm.listexample.enums.CopryrightCarEnum;
import br.com.jvcm.listexample.model.ExampleDataset;
import br.com.jvcm.listexample.utilies.AppUtil;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter;
    private List<ExampleDataset> mDataset;
    private Button btnInsertCar;

    private EditText edtCarName;
    private EditText edtCopyright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateMock();
        mAdapter = new ExampleAdapter(mDataset);
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setAdapter(mAdapter);
        btnInsertCar = findViewById(R.id.btninsert);
        edtCarName = findViewById(R.id.edt_car_name);
        edtCopyright = findViewById(R.id.edt_car_copyright);

        btnInsertCar.setOnClickListener(this::onClick);
    }


    public void onClick(View view){
             ExampleDataset dataset = new ExampleDataset();
             dataset.setName(edtCarName.getText().toString());
             dataset.setCopyright(edtCopyright.getText().toString());

             mDataset.add(dataset);
             mAdapter.notifyDataSetChanged();

        CopryrightCarEnum.FERRARI.name();

        AppUtil.hideKeyboardFrom(MainActivity.this, edtCopyright);
    }

    private void populateMock() {
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

        mDataset = new ArrayList<>();
        mDataset.add(corolla);
        mDataset.add(hrv);
        mDataset.add(ferrari);
       // mDataset.notify(get);
    }
}
