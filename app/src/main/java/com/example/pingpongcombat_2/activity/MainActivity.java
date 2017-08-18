package com.example.pingpongcombat_2.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pingpongcombat_2.R;
import com.example.pingpongcombat_2.fragments.LeaderBoardFragment;
import com.example.pingpongcombat_2.fragments.ProfileFragment;
import com.example.pingpongcombat_2.fragments.RulesFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fragment> fragments;
    private ViewPager vpMain;

    private MainPagerAdapter mainPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vpMain = (ViewPager) findViewById(R.id.vp_main);

        fragments = new ArrayList<>();
        fragments.add(new LeaderBoardFragment());
        fragments.add(new ProfileFragment());
        fragments.add(new RulesFragment());

        mainPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        vpMain.setAdapter(mainPagerAdapter);
    }

    private class MainPagerAdapter extends FragmentStatePagerAdapter{
        public MainPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }
}
