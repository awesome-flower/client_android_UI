package com.example.bbarroo.awesome;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

public class Bulletin_Main extends AppCompatActivity {
    public Bulletin_Main(){}
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bulletin_main);
        ListView listview = findViewById(R.id.listview1);
        Bulletin_LVA adapter = new Bulletin_LVA() ;
        listview.setAdapter(adapter);

        // 아이템 추가하는 방법 (제목, 내용, 이름, 시간)
        adapter.addItem("앙","기","모","띠");
        adapter.addItem("어서와","모두너를기다려","카라잔","PM 04:12");
    }
}
