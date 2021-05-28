package com.fausto.droidcafe;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, FormularioActivity.class);
                intent.putExtra("producto","mensaje");
                startActivity(intent);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()){
            case R.id.action_estado:
             displayToast(getString(R.string.accion_estado_mensage));
             return true;
            case R.id.action_contacto:
                displayToast(getString(R.string.accion_contacto_mensage));
                return  true;
            case R.id.action_orden:
                Intent intent = new Intent(MainActivity.this, FormularioActivity.class);
                intent.putExtra("producto","mensaje");
                startActivity(intent);
                displayToast(getString(R.string.accion_orden_mensage));
                return  true;
            case R.id.acttion_favoritos:
                displayToast(getString(R.string.accion_favoritos_mensage));
                return  true;
        }

        /*  int id = item.getItemId();
       if (id == R.id.action_orden) {
            displayToast(getString(R.string.accion_orden_mensage));
           return true; }
        if (id == R.id.action_contacto) {
            displayToast(getString(R.string.accion_contacto_mensage));
            return true;}
        if (id == R.id.action_estado) {
            displayToast(getString(R.string.accion_estado_mensage));
            return true;}
         if (id == R.id.acttion_favoritos) {
            displayToast(getString(R.string.accion_favoritos_mensage));
            return true;}*/
        return super.onOptionsItemSelected(item);
    }

    public void displayToast (String mensagge){
        Toast.makeText(getApplicationContext(), mensagge,Toast.LENGTH_SHORT).show();
    }

    public void mostrarOrdenDonut(View view){

        displayToast(getString(R.string.orden_donut));
        Intent intent = new Intent(MainActivity.this, FormularioActivity.class);
        intent.putExtra("producto", "Donut");
        startActivity(intent);
    }

    public void mostrarOrdenHelado (View view){

        displayToast(getString(R.string.orden_helado));
        Intent intent = new Intent(MainActivity.this, FormularioActivity.class);
        intent.putExtra("producto", "Helado");
        startActivity(intent);

    }
    
    public void mostrarOrdenFroyo(View view){

        displayToast(getString(R.string.orden_froyo));
        Intent intent = new Intent(MainActivity.this, FormularioActivity.class);
        intent.putExtra("producto", "Froyo");
        startActivity(intent);



    }
}