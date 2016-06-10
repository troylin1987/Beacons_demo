package com.example.l0011319.beacons_demo;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.estimote.sdk.SystemRequirementsChecker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SystemRequirementsChecker.checkWithDefaultDialogs(this);
    }

    protected void onResume(Bundle savedInstanceState) {
        super.onResume();
        setContentView(R.layout.activity_main);
    }

    protected void onDestroy(Bundle savedInstanceState) {
        super.onDestroy();
        setContentView(R.layout.activity_main);
    }

    public void acercade(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Versión de la app 0.1 Beta")
                .setTitle("Acerca de esta app");
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Context context = getApplicationContext();
                Toast.makeText(context,"¡Gracias!",Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void perfil(View v){
        Intent intent = new Intent(this, PerfilActivity.class);
        startActivity(intent);
    }

}
