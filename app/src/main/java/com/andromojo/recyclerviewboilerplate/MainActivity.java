package com.andromojo.recyclerviewboilerplate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.andromojo.recyclerviewboilerplate.Adapter.BoilerplateAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String recyclerViewItemArray[] = {"Apple",
                "Microsoft",
                "Google",
                "Amazon",
                "HP",
                "Dell",
                "Tesla",
                "Samsung",
                "Sony",
                "Intel",
                "IBM",
                "LG",
                "Panasonic",
                "Facebook",
                "Cisco",
                "Lenovo"
        };
        recyclerView.setAdapter(new BoilerplateAdapter(recyclerViewItemArray));
    }
}