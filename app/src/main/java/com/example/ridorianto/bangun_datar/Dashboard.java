package com.example.ridorianto.bangun_datar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void btn_psg(View view){
        Intent psg = new Intent(Dashboard.this, Persegi.class);
        startActivity(psg);
    }

    public void btn_sgt (View view){
        Intent sgt = new Intent(Dashboard.this, Segitiga.class);
        startActivity(sgt);
    }

    public void btn_jjrg (View view){
        Intent jjrg = new Intent(Dashboard.this, Jajargenjang.class);
        startActivity(jjrg);
    }
    public void btn_blkt (View view) {
        Intent blkt = new Intent(Dashboard.this, Belahketupat.class);
        startActivity(blkt);
    }
    public void btn_trpm (View view) {
        Intent trpm = new Intent(Dashboard.this, Trapesium.class);
        startActivity(trpm);
    }
}
