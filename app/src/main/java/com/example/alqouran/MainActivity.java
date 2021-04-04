package com.example.alqouran;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;

import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import Contrllar.Tabadapter;
import View.Edoaa;
import View.Equran;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawer ;
    Toolbar toolbar;
    NavigationView navigationView;
    ViewPager viewPager;
    Tabadapter tabadapter;
    TabLayout tabLayout;
    TextView textView;
    Switch aSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.mytool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        navigationView = findViewById(R.id.nev_view);
        tabLayout = findViewById(R.id.my_tab);
        viewPager = findViewById(R.id.view_pa);
        View v = navigationView.getHeaderView(0);
        textView = v.findViewById(R.id.ttt);
        textView.append(Html.fromHtml(getResources().getString(R.string.name1)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        aSwitch = v.findViewById(R.id.dark_mode);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //Toast.makeText(getApplicationContext(),"is checed",Toast.LENGTH_LONG).show();

            }
        });
        drawer = findViewById(R.id.drower_l);
        tabadapter = new Tabadapter(getSupportFragmentManager());
        tabadapter.addFrafment(new Equran(),getResources().getString(R.string.qoran));
        tabadapter.addFrafment(new Edoaa(),getResources().getString(R.string.doaa));
        viewPager.setAdapter(tabadapter);
        tabLayout.setupWithViewPager(viewPager);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }


}