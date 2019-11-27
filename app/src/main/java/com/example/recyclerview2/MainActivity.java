package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView1=findViewById(R.id.recyclerview);

        List<Students>studentsList=new ArrayList<>();
        studentsList.add(new Students("Bhuwan kC","KTM","Male",22,R.drawable.male));
        studentsList.add(new Students("Raja kC","Kapan","Female",22,R.drawable.female));

        StudentAdapter studentAdapter=new StudentAdapter(this,studentsList);
        recyclerView1.setAdapter(studentAdapter);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
    }

}
