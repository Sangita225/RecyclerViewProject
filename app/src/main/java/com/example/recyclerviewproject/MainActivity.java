package com.example.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        //create list of students to display in recycleview
        List<Students>studentsList=new ArrayList<>();
        studentsList.add(new Students("Ram","ktm",22,"male",R.drawable.male,R.drawable.dustbin));
        studentsList.add(new Students("Sita","ktm",22,"female",R.drawable.female,R.drawable.dustbin));
        studentsList.add(new Students("Kamal","ktm",22,"others",R.drawable.others,R.drawable.dustbin));

    StudentsAdapter studentsAdapter=new StudentsAdapter(this,studentsList);
    recyclerView.setAdapter(studentsAdapter);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}
