package com.example.danielq.mycartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnEntradas = (Button) findViewById(R.id.buttonEnt);
        btnEntradas.setOnClickListener(this);
        Button btnPostres = (Button) findViewById(R.id.buttonpost);
        btnPostres.setOnClickListener(this);
        Button btnPF = (Button) findViewById(R.id.buttonPF);
        btnPF.setOnClickListener(this);
        Button btnBB = (Button) findViewById(R.id.buttonbeb);
        btnBB.setOnClickListener(this);
    }
    public void lanzarActivity (int idView) {
        Intent i ;
        switch (idView) {
            case R.id.buttonEnt:
                i = new Intent(this, EntradasActivity.class);
                startActivity(i);
                break;
            case R.id.buttonpost:
                i = new Intent(this, PostresActivity.class);
                startActivity(i);
                break;
            case R.id.buttonPF:
                i = new Intent(this, PlaFuerActivity.class);
                startActivity(i);
                break;
            case R.id.buttonbeb:
                i = new Intent(this, BebidasActivity.class);
                startActivity(i);
                break;
        }
    }
    @Override
    public void onClick(View view) {
        lanzarActivity (view.getId());
    }
}