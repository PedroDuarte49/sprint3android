package com.example.mycatalog;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView tv = new TextView(getContext());
        tv.setText("Aplicación My Catalog\nCreada en Android Studio con Java.");
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setTextSize(18);
        return tv;
    }
}
