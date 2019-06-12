package com.example.tp_ipi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ht;
    EditText tva;
    Button button;
    double htNumber;
    double tvaNumber;
    TextView ttc;
    double resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ttc = findViewById(R.id.ttc);
        button = (Button) findViewById(R.id.button);
        ht = (EditText) findViewById (R.id.ht);
        tva = (EditText) findViewById(R.id.tva);
    }

    public void clickButton(View view) {
        htNumber = (double) Double.parseDouble(ht.getText().toString());
        tvaNumber= (double) Double.parseDouble(tva.getText().toString());
        resultat =  htNumber*(1+ tvaNumber/100);
        ttc.setText("TTC : " + String.valueOf(resultat)+" €");
    }
}
