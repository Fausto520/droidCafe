package com.fausto.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {
    public TextView textViewDescriptiont;
    public ImageView imageViewFormulario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        textViewDescriptiont = findViewById(R.id.textViewDescription);
        imageViewFormulario = findViewById(R.id.imageViewFormulario);

        Intent intent = getIntent();
        String producto = intent.getStringExtra("producto");

        if (producto.equals("Donut")){
            textViewDescriptiont.setText(R.string.donut);
            imageViewFormulario.setImageResource(R.drawable.donut_circle);
        }
        if (producto.equals("Helado")){
            textViewDescriptiont.setText(R.string.ice_cream_sandwiches);
            imageViewFormulario.setImageDrawable(getDrawable(R.drawable.icecream_circle));
        }
        if (producto.equals("Froyo")){
            textViewDescriptiont.setText(R.string.froyo);
            imageViewFormulario.setImageDrawable(getDrawable(R.drawable.froyo_circle));
        }



    }
    public void displayToast (String mensage){
        Toast.makeText(getApplicationContext(),mensage, Toast.LENGTH_SHORT).show();
    }


    public void botonRadio(View view) {

        boolean marcado = ((RadioButton) view).isChecked();
        switch (view.getId()){

            case R.id.entregar_hoy:

                if(marcado){
                    displayToast(getString(R.string.envio_hoy));
                }
                break;
            case R.id.mañana:

                if(marcado){
                    displayToast((getString(R.string.envio_mañana)));
                }

            case R.id.recoger:
                if(marcado){
                    displayToast(getString(R.string.envio_recoger));
                }

        }


    }
}