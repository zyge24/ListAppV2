package com.example.listappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager2.widget.ViewPager2;
public class MainActivity extends AppCompatActivity {
    private Storage storage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        storage = Storage.getInstance();
        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager2 fragmentArea = findViewById(R.id.fragment);
        TabAdapter tabPagerAdapter = new TabAdapter(this);
        fragmentArea.setAdapter(tabPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                fragmentArea.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        fragmentArea.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });

    }
}