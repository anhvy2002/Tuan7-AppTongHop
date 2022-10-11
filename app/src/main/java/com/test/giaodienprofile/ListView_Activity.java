package com.test.giaodienprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListView_Activity extends AppCompatActivity {
    ListView listView;
    ArrayList<GiaDung> arrayList;
    Apdater adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        AnhXa();

        adapter = new Apdater(this, R.layout.giadung_layout, arrayList);
        listView.setAdapter(adapter);

    }
    private void AnhXa(){
        listView = findViewById(R.id.list_view);
        arrayList = new ArrayList<>();
        arrayList.add(new GiaDung(R.drawable.giadung1, "Chảo", "200.000 VNĐ"));
        arrayList.add(new GiaDung(R.drawable.giadung2, "Nồi", "450.000 VNĐ"));
        arrayList.add(new GiaDung(R.drawable.giadung3, "Nồi cơm điện", "1.600.000 VNĐ"));
        arrayList.add(new GiaDung(R.drawable.giadung4, "Nồi áp suất", "900.000 VNĐ"));
        arrayList.add(new GiaDung(R.drawable.giadung5, "Bình nước", "2.150.000 VNĐ"));
        arrayList.add(new GiaDung(R.drawable.giadung6, "Tủ", "800.000 VNĐ"));
    }
}