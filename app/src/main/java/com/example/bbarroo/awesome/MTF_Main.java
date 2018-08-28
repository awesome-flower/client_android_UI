package com.example.bbarroo.awesome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class MTF_Main extends Fragment {
    public MTF_Main(){}
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.main_frag_3, container,false);
        ListView listview = view.findViewById(R.id.listview1);
        MTF_LVA adapter = new MTF_LVA() ;
        listview.setAdapter(adapter);

        // 아이템 추가하는 방법 (제목, 내용, 이름, 시간)
        adapter.addItem("강서");
        adapter.addItem("광나루");
        adapter.addItem("난지");
        adapter.addItem("뚝섬");
        adapter.addItem("망원");
        adapter.addItem("반포");
        adapter.addItem("양화");
        adapter.addItem("여의도");
        adapter.addItem("이촌");
        adapter.addItem("잠실");
        adapter.addItem("잠원");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent intent = new Intent(getActivity(), Bulletin_Main.class);
                    startActivity(intent);
                }
            }
        });


        return view;

    }
}
