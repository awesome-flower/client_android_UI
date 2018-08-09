package com.example.bbarroo.bottombar;

import android.graphics.drawable.Drawable;

public class ListViewItem {
    private Drawable pictDrawable ;
    private int cntInt ;

    public void setPic(Drawable icon) {
        pictDrawable = icon ;
    }
    public void setCnt(int cnt) {
        cntInt = cnt ;
    }

    public Drawable getPic() {
        return this.pictDrawable ;
    }
    public int getCnt() {
        return this.cntInt ;
    }

}
