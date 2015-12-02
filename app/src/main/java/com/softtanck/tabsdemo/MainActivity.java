package com.softtanck.tabsdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.softtanck.tabsdemo.adapter.MyPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private TabLayout tabLayout;

    private ViewPager viewPager;

    private MyPagerAdapter adapter;

    private List<View> list;

    private List<String> titlelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tb_layout);
        viewPager = (ViewPager) findViewById(R.id.vp);

        list = new ArrayList<>();
        titlelist = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(View.inflate(MainActivity.this, R.layout.content, null));
            titlelist.add("Title" + i);
        }
        adapter = new MyPagerAdapter(MainActivity.this, list, titlelist);
        viewPager.setAdapter(adapter);
        // First we'll add Tabs, using the adapter's page titles
        // setTabsFromPagerAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager); // 关联viewPager

        //private List<OnPageChangeListener> mOnPageChangeListeners;

        /**
         *
         * //单独的判断是否设置了setListener,兼容废弃掉的函数
         * if (mOnPageChangeListener != null) {
         *      mOnPageChangeListener.onPageScrolled(position, offset, offsetPixels);
         *  }
         *
         * //从集合中判断是否设置多个监听,这样可以方便给Tablayout与Viewpager及用户自己去监听.
         * if (mOnPageChangeListeners != null) {
         *for (int i = 0, z = mOnPageChangeListeners.size(); i < z; i++) {
         *       OnPageChangeListener listener = mOnPageChangeListeners.get(i);
         *if (listener != null) {
         *      listener.onPageScrolled(position, offset, offsetPixels);
         *   }
         *  }
         *}
         *if (mInternalPageChangeListener != null) {
         *      mInternalPageChangeListener.onPageScrolled(position, offset, offsetPixels);
         *}
         */
        viewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
