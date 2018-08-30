package com.example.ashi.multipleviewtypesinsinglerecyclerview.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ashi.multipleviewtypesinsinglerecyclerview.Adapter.RecyclerViewAdapter;
import com.example.ashi.multipleviewtypesinsinglerecyclerview.Model.DataModel;
import com.example.ashi.multipleviewtypesinsinglerecyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DataModel> dataModels=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        EnterValuesInList();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(dataModels);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
    public void EnterValuesInList(){
        /*function used to enter random values in a list to show some test data*/
        DataModel tempData=new DataModel();
        tempData.setText("This is Heading 1");
        tempData.setViewType(DataModel.HEADER_TYPE);
        dataModels.add(tempData);
        tempData=new DataModel();
        tempData.setText("This is Sub Heading 1");
        tempData.setViewType(DataModel.SUB_HEADER_TYPE);
        dataModels.add(tempData);
        tempData=new DataModel();
        tempData.setText("This is Sub Heading 2");
        tempData.setViewType(DataModel.SUB_HEADER_TYPE);
        dataModels.add(tempData);
        tempData=new DataModel();
        tempData.setText("This is Sub Heading 3");
        tempData.setViewType(DataModel.SUB_HEADER_TYPE);
        dataModels.add(tempData);
        tempData=new DataModel();
        tempData.setText("This is Heading 2");
        tempData.setViewType(DataModel.HEADER_TYPE);
        dataModels.add(tempData);
        tempData=new DataModel();
        tempData.setText("This is Sub Heading 1");
        tempData.setViewType(DataModel.SUB_HEADER_TYPE);
        dataModels.add(tempData);
        tempData=new DataModel();
        tempData.setText("This is Sub Heading 2");
        tempData.setViewType(DataModel.SUB_HEADER_TYPE);
        dataModels.add(tempData);
        tempData=new DataModel();
        tempData.setText("This is Sub Heading 3");
        tempData.setViewType(DataModel.SUB_HEADER_TYPE);
        dataModels.add(tempData);
        tempData=new DataModel();
        tempData.setText("This is Sub Heading 4");
        tempData.setViewType(DataModel.SUB_HEADER_TYPE);
        dataModels.add(tempData);
        tempData=new DataModel();
        tempData.setText("This is Heading 3");
        tempData.setViewType(DataModel.HEADER_TYPE);
        dataModels.add(tempData);
        tempData=new DataModel();
        tempData.setText("This is Sub Heading 1");
        tempData.setViewType(DataModel.SUB_HEADER_TYPE);
        dataModels.add(tempData);
        tempData=new DataModel();
        tempData.setText("This is Sub Heading 2");
        tempData.setViewType(DataModel.SUB_HEADER_TYPE);
        dataModels.add(tempData);tempData=new DataModel();
        tempData.setText("This is Sub Heading 3");
        tempData.setViewType(DataModel.SUB_HEADER_TYPE);
        dataModels.add(tempData);
    }
}
