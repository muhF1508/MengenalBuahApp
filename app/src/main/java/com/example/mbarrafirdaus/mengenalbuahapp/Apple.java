package com.example.mbarrafirdaus.mengenalbuahapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Apple extends AppCompatActivity{
    EditText editTextApple;
    Button bt_proses;
    TextView hasil;
    String benar = "Apel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);

        editTextApple = (EditText) findViewById(R.id.editText);
        bt_proses = (Button) findViewById(R.id.btn_proses);
        hasil = (TextView) findViewById(R.id.txt_hasil);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextApple.length()==0){
                    Toast.makeText(getApplicationContext(),"Belum Diisi Gan",Toast.LENGTH_SHORT).show();
                }
                else{
                    String jawaban = editTextApple.getText().toString();
                    if(jawaban.equals(benar)){
                        String keterangan ="Anda Benar Gan";
                        hasil.setText(keterangan);
                    }
                    else{
                        String keterangan ="Anda Salah Gan";
                        hasil.setText(keterangan);
                    }
                }
            }
        });
    }
}
