package com.example.ciclocomputadorgps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ciclocomputadorgps.controlador.PageController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class aplicacion extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tab1, tab2, tab3, tab4;
    PageController pageController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicacion);
        tabLayout = findViewById(R.id.tabLayaut);
        viewPager = findViewById(R.id.viewPager);

        tab1 = findViewById(R.id.tabEstadistica);
        tab2 = findViewById(R.id.tabHistorial);
        tab3 = findViewById(R.id.tabPerfil);


        pageController = new PageController(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageController);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0){
                    pageController.notifyDataSetChanged();
                }
                if (tab.getPosition() == 1){
                    pageController.notifyDataSetChanged();
                }
                if (tab.getPosition() == 2){
                    pageController.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    public void irActividad(View view){
        Intent intent = new Intent(this, Actividad.class);
        startActivity(intent);
    }
}