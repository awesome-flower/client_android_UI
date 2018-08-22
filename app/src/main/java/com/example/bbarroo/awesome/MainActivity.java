package com.example.bbarroo.awesome;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = (ViewPager)findViewById(R.id.vp);
        LinearLayout btn_first = (LinearLayout)findViewById(R.id.button1);
        LinearLayout btn_second = (LinearLayout)findViewById(R.id.button2);
        LinearLayout btn_third = (LinearLayout)findViewById(R.id.button3);
        LinearLayout btn_fourth = (LinearLayout)findViewById(R.id.button4);
        LinearLayout btn_fifth = (LinearLayout)findViewById(R.id.button5);

        vp.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        vp.setCurrentItem(0);
        btn_first.setOnClickListener(movePageListener);
        btn_first.setTag(0);
        btn_second.setOnClickListener(movePageListener);
        btn_second.setTag(1);
        btn_third.setOnClickListener(movePageListener);
        btn_third.setTag(2);
        btn_fourth.setOnClickListener(movePageListener);
        btn_fourth.setTag(3);
        btn_fifth.setOnClickListener(movePageListener);
        btn_fifth.setTag(4);

    }

    View.OnClickListener movePageListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            int tag = (int) v.getTag();
            vp.setCurrentItem(tag);
        }
    };

    private class pagerAdapter extends FragmentStatePagerAdapter
    {
        public pagerAdapter(android.support.v4.app.FragmentManager fm)
        {
            super(fm);
        }
        @Override
        public android.support.v4.app.Fragment getItem(int position)
        {
            switch(position)
            {
                case 0:
                    return new MFF_Main();
                case 1:
                    return new MSF_Main();
                case 2:
                    return new Bulletin_Main();
                case 3:
                    return new MFF_Main();
                case 4:
                    return new MFFF_Main();
                default:
                    return null;
            }
        }
        @Override
        public int getCount()
        {
            return 5;
        }
    }
}
