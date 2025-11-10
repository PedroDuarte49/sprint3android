package com.example.mycatalog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CatalogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        Button btn = findViewById(R.id.btnDetalle);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(this, DetailActivity.class);
            startActivity(intent);
        });
    }
}
