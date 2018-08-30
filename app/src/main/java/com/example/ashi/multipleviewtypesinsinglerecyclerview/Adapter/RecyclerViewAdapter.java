package com.example.ashi.multipleviewtypesinsinglerecyclerview.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ashi.multipleviewtypesinsinglerecyclerview.Model.DataModel;
import com.example.ashi.multipleviewtypesinsinglerecyclerview.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter {
    List<DataModel> dataModels;
    static final int HEADER_VIEW_TYPE=1;
    static final int SUBHEADER_VIEW_TYPE=2;
    public  RecyclerViewAdapter(List<DataModel> dataModels)
    {
        this.dataModels=dataModels;

    }
    class HeaderViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.header);
        }
    }
    class SubHeaderViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public SubHeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.sub_header);
        }
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view;
        switch (viewType){
            case HEADER_VIEW_TYPE:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header_view_type, viewGroup, false);
                return new HeaderViewHolder(view);
            case SUBHEADER_VIEW_TYPE:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sub_header_view_type, viewGroup, false);
                return new SubHeaderViewHolder(view) ;
            default:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sub_header_view_type, viewGroup, false);
                return new SubHeaderViewHolder(view) ;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        switch (dataModels.get(position).getViewType()) {
            case DataModel.HEADER_TYPE:
                HeaderViewHolder headerViewHolder=(HeaderViewHolder) viewHolder;
                headerViewHolder.textView.setText(dataModels.get(position).getText());
                break;
            case DataModel.SUB_HEADER_TYPE:
                SubHeaderViewHolder subHeaderViewHolder=(SubHeaderViewHolder) viewHolder;
                subHeaderViewHolder.textView.setText(dataModels.get(position).getText());
                break;
        }

    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(dataModels.get(position).getViewType().equals(DataModel.HEADER_TYPE)){
            return HEADER_VIEW_TYPE;
        }
        if(dataModels.get(position).getViewType().equals(DataModel.SUB_HEADER_TYPE)){
            return SUBHEADER_VIEW_TYPE;
        }
        else {
            return SUBHEADER_VIEW_TYPE;
        }
    }
}
