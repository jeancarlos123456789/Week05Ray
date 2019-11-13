package com.example.bichito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnProducts;
    private Button btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Enlazamos Activity + layout

        btnProducts = (Button) findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);

        btnProducts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //log.i(Settings.INFO, "Products");

                //Intent sirve para cambiar de pantalla
                Intent i = new Intent(MainActivity.this, ProductListActivity.class);
                startActivity(i);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //log.i(Settings.INFO, "About us");
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume(); //este codigo se ejecuta antes de todos.
        //En este punto la aplicacion ya cargo.
        //this es un activity: es la esencia de una pantalla, controlar toda la pantalla,
        //                      llamar a un bootom
        Toast.makeText(this,
                "Aplicacion Iniciada",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,
                "Aplicacion Stopeada",
        Toast.LENGTH_LONG).show();

    }
}
