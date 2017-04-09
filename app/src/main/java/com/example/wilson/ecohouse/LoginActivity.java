package com.example.wilson.ecohouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
private Button PreInscrpcion;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      PreInscrpcion=(Button) findViewById(R.id.btnPreInscrpcion);
        PreInscrpcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActivity();
            }
        });
    }
    public void abrirActivity(){
        intent =new Intent(getApplicationContext(),RegistroActivity.class);
        startActivity(intent);
    }

}
