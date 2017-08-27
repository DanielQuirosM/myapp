package com.example.danielq.mycartavirtual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMap = (Button) findViewById(R.id.buttonMyMap);
        btnMap.setOnClickListener(this);
        Button btnMenu = (Button) findViewById(R.id.ButtonCarta);
        btnMenu.setOnClickListener(this);
    }
    public void lanzarActivity (int idView) {
        Intent i ;
        switch (idView) {
            case R.id.buttonMyMap:
                i = new Intent(this, MapsActivity.class);
                startActivity(i);
                break;
            case R.id.ButtonCarta:
                i = new Intent(this, MenuActivity.class);
                startActivity(i);
                break;
        }
    }
    @Override
    public void onClick(View view) {
        lanzarActivity (view.getId());
    }
}
