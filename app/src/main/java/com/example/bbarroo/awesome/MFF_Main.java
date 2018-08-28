package com.example.bbarroo.awesome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.support.v4.app.Fragment;
import android.widget.ListView;

public class MFF_Main extends android.support.v4.app.Fragment {
    public MFF_Main(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.main_frag_1, container,false);
        ListView listview = view.findViewById(R.id.listview1);
        MFF_LVA adapter = new MFF_LVA() ;
        listview.setAdapter(adapter);

        // 아이템 추가하는 방법 (표시하고픈 사진, 이름, 좋아요 수)
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.han_none),"hello",15);

        return view;

    }

}
