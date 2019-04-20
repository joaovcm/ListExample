package br.com.jvcm.listexample.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.jvcm.listexample.R;
import br.com.jvcm.listexample.model.ExampleDataset;

public class ExampleAdapter extends RecyclerView
        .Adapter<ExampleAdapter.DataObjectHolder> {

    private List<ExampleDataset> mDataset;

    public ExampleAdapter(List<ExampleDataset> datasets) {
        mDataset = datasets;
    }

    @NonNull
    @Override
    public DataObjectHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View cellView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_cell_list_car, viewGroup, false);

        DataObjectHolder objectHolder = new DataObjectHolder(cellView);
        return objectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int i) {
        ExampleDataset set = mDataset.get(i);


        holder.tvCarName.setText(set.getName());
        holder.tvCarCorpyright.setText(set.getCopyright());
        holder.imgCar.setImageResource(set.getImgeCar());
        holder.imgCopyright.setImageResource(set.getImageCopyright());

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class DataObjectHolder extends RecyclerView.ViewHolder {
        TextView tvCarName;
        TextView tvCarCorpyright;
        ImageView imgCar;
        ImageView imgCopyright;
        Button btnInsert;


        public DataObjectHolder(@NonNull View itemView) {
            super(itemView);

            tvCarName = itemView.findViewById(R.id.tv_car_name);
            tvCarCorpyright = itemView.findViewById(R.id.tv_car_copyright);
            imgCar = itemView.findViewById(R.id.img_car);
            btnInsert = itemView.findViewById(R.id.btninsert);
            imgCopyright = itemView.findViewById(R.id.img_copyright);

        }
    }
}
