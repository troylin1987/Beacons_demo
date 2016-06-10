package com.example.l0011319.beacons_demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class PerfilActivity extends AppCompatActivity {
    Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

    public void atras(View v){
        finish();
    }

    public void aceptar(View v){
        Context context = getApplicationContext();
        Toast.makeText(context,"Registrado correctamente.",Toast.LENGTH_LONG).show();
        finish();
    }

}
