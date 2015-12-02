package com.softtanck.tabsdemo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by winterfell on 12/2/2015.
 */
public class MyPagerAdapter extends PagerAdapter {

    private Context context;

    private List<View> list;

    private List<String> mTitlelist;

    public MyPagerAdapter(Context context, List<View> list, List<String> titlelist) {
        this.context = context;
        this.list = list;
        this.mTitlelist = titlelist;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(list.get(position));
        return list.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(list.get(position));
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitlelist.get(position);
    }
}
