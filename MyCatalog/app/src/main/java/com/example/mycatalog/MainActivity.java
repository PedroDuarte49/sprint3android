package com.example.mycatalog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView nav = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new CatalogFragment())
                .commit();

        nav.setOnItemSelectedListener(item -> {
            Fragment selected = null;

            if (item.getItemId() == R.id.nav_catalog)
                selected = new CatalogFragment();
            else if (item.getItemId() == R.id.nav_about)
                selected = new AboutFragment();

            if (selected != null)
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, selected)
                        .commit();

            return true;
        });
    }
}

