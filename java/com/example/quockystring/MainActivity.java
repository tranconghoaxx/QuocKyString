package com.example.quockystring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvdanhSach;
    Spinner dsSpiner;
    ArrayList<String>data = new ArrayList<>();
//    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        KhoiTao();
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,data);
        lvdanhSach.setAdapter(adapter);
    }

    private void KhoiTao() {
        data.add("CongHoa");
        data.add("NguyenA");
        data.add("TranB");
    }

    private void setControl() {
        lvdanhSach = findViewById(R.id.listView);
        dsSpiner = findViewById(R.id.spiner);
    }
}
