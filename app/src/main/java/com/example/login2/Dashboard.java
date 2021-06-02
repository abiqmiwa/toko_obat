package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.login2.Allergy;
import com.example.login2.Antibiotics;
import com.example.login2.Asthma;
import com.example.login2.Eyes;
import com.example.login2.Fever;
import com.example.login2.Flu;
import com.example.login2.Herbal;
import com.example.login2.Kids;
import com.example.login2.R;
import com.example.login2.Skin;
import com.example.login2.Vitamin;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void flu(View view) {
        Intent intent = new Intent(Dashboard.this, Flu.class);
        startActivity(intent);
    }
    public void antibiotics(View view) {
        Intent intent = new Intent(Dashboard.this, Antibiotics.class);
        startActivity(intent);
    }
    public void eyes(View view) {
        Intent intent = new Intent(Dashboard.this, Eyes.class);
        startActivity(intent);
    }
    public void fever(View view) {
        Intent intent = new Intent(Dashboard.this, Fever.class);
        startActivity(intent);
    }
    public void kids(View view) {
        Intent intent = new Intent(Dashboard.this, Kids.class);
        startActivity(intent);
    }
    public void skin(View view) {
        Intent intent = new Intent(Dashboard.this, Skin.class);
        startActivity(intent);
    }
    public void allergy(View view) {
        Intent intent = new Intent(Dashboard.this, Allergy.class);
        startActivity(intent);
    }

    public void vitamin(View view) {
        Intent intent = new Intent(Dashboard.this, Vitamin.class);
        startActivity(intent);
    }

    public void asthma(View view) {
        Intent intent = new Intent(Dashboard.this, Asthma.class);
        startActivity(intent);
    }

    public void herbal(View view) {
        Intent intent = new Intent(Dashboard.this, Herbal.class);
        startActivity(intent);
    }



}

