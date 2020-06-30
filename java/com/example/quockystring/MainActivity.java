package com.example.quockystring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvdanhSach;
    ArrayList<QuocKy>data = new ArrayList<>();
//    CustomAdapter adapter;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        KhoiTao();
        adapter =new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
//        adapter = new CustomAdapter(this,R.layout.listview_item,data);
        lvdanhSach.setAdapter(adapter);
    }

    private void KhoiTao() {
        QuocKy qk1 = new QuocKy();
        qk1.setCo(R.drawable.vietnam);
        qk1.setTen("Việt Nam");
        data.add(qk1);

        QuocKy qk2 = new QuocKy();
        qk2.setCo(R.drawable.england);
        qk2.setTen("England");
        data.add(qk2);

        QuocKy qk3 = new QuocKy();
        qk3.setCo(R.drawable.us);
        qk3.setTen("US");
        data.add(qk3);
    }

    private void setControl() {
        lvdanhSach = findViewById(R.id.listView);
    }
}
