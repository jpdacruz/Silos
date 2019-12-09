package com.jpdacruz.silos.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jpdacruz.silos.MainActivity;
import com.jpdacruz.silos.R;

public class InicioFiscalizacionActivity extends AppCompatActivity {

    Button btnContinuar;
    TextView redireccionando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_fiscalizacion);

        redireccionando = findViewById(R.id.textViewRedireccionando);

        btnContinuar = findViewById(R.id.button2);
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                redireccionando.setText("abriendo base de datos...");

                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {


                        Intent intent;

                        intent = new Intent(InicioFiscalizacionActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                },3000);

            }
        });


    }
}
