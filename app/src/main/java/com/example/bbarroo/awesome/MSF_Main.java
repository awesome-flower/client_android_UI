package com.example.bbarroo.awesome;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MSF_Main extends Fragment {
    public MSF_Main(){}
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.main_frag_2, container,false);
        ListView listview = view.findViewById(R.id.listview1);
        MSF_LVA adapter = new MSF_LVA() ;
        listview.setAdapter(adapter);

        // 아이템 추가하는 방법 (제목, 내용, 이름, 시간)
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.han_none),"앙","기","모");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.date),"어서와","모두너를기다려","카라잔");

        return view;

    }
}
